import java.util.ArrayList;
import java.util.List;

public class CommandDispatcher
{
    private CommandDispatcher() { }
    
    private static final List<CommandExecutor> commandChain = new ArrayList<>();
    
    static
    {
        register(CertainCommandExecutor.builder()
                .whenTrigger(1)
                .thenInteger()
                .thenLiteral()
                .thenAct(new CreateAdventurer())
                .build()
        );
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(2)
                .thenInteger()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenAct(new AddBottle())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(3)
                .thenInteger()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenAct(new AddEquipment())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(4)
                .thenInteger()
                .thenInteger()
                .thenAct(new IncreaseDurability())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(5)
                .thenInteger()
                .thenInteger()
                .thenAct(new RemoveItem())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(6)
                .thenInteger()
                .thenInteger()
                .thenAct(new EquipItem())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(7)
                .thenInteger()
                .thenInteger()
                .thenAct(new UseBottle())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(8)
                .thenInteger()
                .thenInteger()
                .thenLiteral()
                .thenAct(new AddFragment())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(9)
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenAct(new RedeemWelfare())
                .build());
        
        register(CertainCommandExecutor.builder()
                .whenTrigger(10)
                .thenInteger()
                .thenLiteral()
                .thenInteger()
                .thenAct(new Combat())
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
