public abstract class CommandExecutor
{
    public abstract void accept(String[] commandTokens);
    
    public int getTrigger()
    {
        return 0;
    }
}

