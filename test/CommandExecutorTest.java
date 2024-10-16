import org.junit.Test;

import static org.junit.Assert.*;
public class CommandExecutorTest {
    
    @Test
    public void accept()
    {
        CommandExecutor ce = new CommandExecutor() {
            @Override
            public void accept(String[] commandTokens)
            {
                return;
            }
        };
        ce.accept(null);
        assertEquals(ce.getTrigger(), 0);
    }
}