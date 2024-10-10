import java.util.ArrayList;
import java.util.List;

public class CommandDispatcher
{
    private CommandDispatcher() { }
    
    private static final List<CommandExecutor> commandChain = new ArrayList<>();
    
    static
    {
        register(CommandExecutor.builder()
                .whenTrigger(1)
                .thenInteger()
                .thenLiteral()
                .thenAct(new CreateAdventurer())
                .build()
        );
        
        register(CommandExecutor.builder()
                .whenTrigger(2)
                .thenInteger()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenAct(new AddBottle())
                .build());
        
        register(CommandExecutor.builder()
                .whenTrigger(3)
                .thenInteger()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenInteger()
                .thenAct(new AddEquipment())
                .build());
        
        register(CommandExecutor.builder()
                .whenTrigger(4)
                .thenInteger()
                .thenInteger()
                .thenAct(new IncreaseDurability())
                .build());
        
        register(CommandExecutor.builder()
                .whenTrigger(5)
                .thenInteger()
                .thenInteger()
                .thenAct(new RemoveItem())
                .build());
        
        register(CommandExecutor.builder()
                .whenTrigger(6)
                .thenInteger()
                .thenInteger()
                .thenAct(new EquipItem())
                .build());
        
        register(CommandExecutor.builder()
                .whenTrigger(7)
                .thenInteger()
                .thenInteger()
                .thenAct(new UseBottle())
                .build());
        
    }
    
    private static void register(CommandExecutor command)
    {
        assert commandChain.stream().noneMatch(old -> old.getTrigger() == command.getTrigger());
        commandChain.add(command);
    }
    
    public static void submit(String rawCommand)
    {
        String[] tokens = rawCommand.split(" +");
        int trigger = Integer.parseInt(tokens[0]);
        for (CommandExecutor executor : commandChain)
        {
            if (trigger == executor.getTrigger())
            {
                executor.accept(tokens);
                return;
            }
        }
        System.out.println("Unknown operation");
    }
}
