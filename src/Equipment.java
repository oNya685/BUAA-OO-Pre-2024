public class Equipment
{
    private int id;
    private String name;
    private int durability;
    
    public Equipment(int equId, String name, int durability)
    {
        this.id = equId;
        this.name = name;
        this.durability = durability;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getDurability()
    {
        return durability;
    }
    
    public void setDurability(int durability)
    {
        this.durability = durability;
    }
}