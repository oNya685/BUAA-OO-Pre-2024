import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class CommandExecutor {
    private final ArrayList<Function<String, Object>> parser;
    private final Consumer<Object[]> commandAction;
    private final int trigger;

    private CommandExecutor(ArrayList<Function<String, Object>> parser, Consumer<Object[]> commandAction, int trigger) {
        this.parser = parser;
        this.commandAction = commandAction;
        this.trigger = trigger;
    }

    public int getTrigger() {
        return trigger;
    }

    public void accept(String[] commandTokens) {
        if (commandTokens.length != this.parser.size() + 1) {
            return;
        }

        try {
            Object[] parsedArgs = IntStream.range(1, commandTokens.length)
                    .mapToObj(i -> parser.get(i - 1).apply(commandTokens[i]))
                    .toArray();

            this.commandAction.accept(parsedArgs);
        } catch (Exception e) {
            // bad token
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ArrayList<Function<String, Object>> parser = new ArrayList<>();
        private Consumer<Object[]> commandAction;
        private int trigger;

        public Builder whenTrigger(int trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder thenInteger() {
            this.parser.add(Integer::parseInt);
            return this;
        }

        public Builder thenLiteral() {
            this.parser.add(elem -> elem);
            return this;
        }

        public Builder thenAct(Consumer<Object[]> action) {
            this.commandAction = action;
            return this;
        }

        public CommandExecutor build() {
            return new CommandExecutor(parser, commandAction, trigger);
        }
    }
}
