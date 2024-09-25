import java.util.ArrayList;

public class Adventurer
{
    private int id;
    private String name;
    private ArrayList<Bottle> bottles;
    private ArrayList<Equipment> equipments;
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Adventurer(int advId, String name)
    {
        this.id = advId;
        this.name = name;
        this.bottles = new ArrayList<>();
        this.equipments = new ArrayList<>();
    }
    
    public void addBottle(Bottle b)
    {
        if (b != null)
        {
            bottles.add(b);
        }
    }
    
    public Bottle getBottleById(int botId)
    {
        for (Bottle b : this.bottles)
        {
            if (b.getId() == botId)
            {
                return b;
            }
        }
        return null;
    }
    
    public int getBottleCount()
    {
        return this.bottles.size();
    }
    
    public void removeBottle(Bottle b)
    {
        if (b != null)
        {
            this.bottles.remove(b);
        }
    }
    
    public void addEquipment(Equipment e)
    {
        if (e != null)
        {
            this.equipments.add(e);
        }
    }
    
    public Equipment getEquipmentById(int equId)
    {
        for (Equipment e : this.equipments)
        {
            if (e.getId() == equId)
            {
                return e;
            }
        }
        return null;
    }
    
    public int getEquipmentCount()
    {
        return equipments.size();
    }
    
    public void removeEquipment(Equipment e)
    {
        if (e != null)
        {
            equipments.remove(e);
        }
    }
    
    public void increaseEquipmentDurability(int equId)
    {
        Equipment e = getEquipmentById(equId);
        if (e != null)
        {
            e.setDurability(e.getDurability() + 1);
        }
    }
}