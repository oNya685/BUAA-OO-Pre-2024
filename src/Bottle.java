public class Bottle
{
    private int id;
    private String name;
    private int capacity;
    
    public Bottle(int botId, String name, int capacity)
    {
        this.id = botId;
        this.name = name;
        this.capacity = capacity;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
}