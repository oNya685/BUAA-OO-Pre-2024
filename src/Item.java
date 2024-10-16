public class Item
{
    private final int id;
    private final String name;
    
    public Item(int id, String name)
    {
        this.id = id;
        this.name = name;
        World.getInstance().getItemPool().add(this);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void information()
    {
        System.out.print(name + " ");
    }
    
    public void die() { World.getInstance().die(this); }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Item))
        {
            return false;
        }

        return this.id == ((Item) obj).id;
    }
    
    @Override
    public int hashCode()
    {
        return this.id;
    }
}
