import java.util.ArrayList;

public class Adventurer implements CombatEffectiveness
{
    private int id;
    private String name;
    
    private int hitPoint;
    private int atk;
    private int def;
    private ArrayList<Bottle> bottles;
    private ArrayList<Equipment> equipments;
    private ArrayList<Item> backpack;
    
    public int getId() { return id; }
    
    public String getName() { return name; }
    
    public int getHitPoint() { return hitPoint; }
    
    public int getAtk() { return atk; }
    
    public int getDef() { return def; }
    
    public int getCombatEffectiveness() { return atk + def; }
    
    public void setHitPoint(int hitPoint) { this.hitPoint = hitPoint; }
    
    public void setAtk(int atk) { this.atk = atk; }
    
    public void setDef(int def) { this.def = def; }
    
    public Adventurer(int advId, String name)
    {
        this.id = advId;
        this.name = name;
        this.bottles = new ArrayList<>();
        this.equipments = new ArrayList<>();
        this.backpack = new ArrayList<>();
    }
    
    public void addBottle(Bottle b)
    {
        if (b != null)
        {
            bottles.add(b);
        }
    }
    
    public int getBottleCount()
    {
        return this.bottles.size();
    }
    
    public void useBottle(Bottle bottle)
    {
        if (bottle != null)
        {
            if (bottle.isEmpty())
            {
                removeItem(bottle);
            } else
            {
                bottle.use(this);
            }
        }
    }
    
    public void addEquipment(Equipment e)
    {
        if (e != null)
        {
            this.equipments.add(e);
        }
    }
    
    public int getEquipmentCount()
    {
        return equipments.size();
    }
    
    public void increaseEquipmentDurability(int equId)
    {
        Equipment e = getEquipmentById(equId);
        if (e != null)
        {
            e.setDurability(e.getDurability() + 1);
        }
    }
    
    public void carryItem(Item item)
    {
        if (!backpack.contains(item))
        {
            backpack.add(item);
        }
    }
    
    public void removeItemInBackpack(Item item)
    {
        backpack.remove(item);
    }
    
    //    public Item getItemByIdInBackpack(int itemId)
    //    {
    //        for (Item item : this.backpack)
    //        {
    //            if (item.getId() == itemId)
    //            {
    //                return item;
    //            }
    //        }
    //        return null;
    //    }
    
    public Bottle getBottleById(int botId)
    {
        for (Bottle bottle : bottles)
        {
            if (bottle.getId() == botId)
            {
                return bottle;
            }
        }
        return null;
    }
    
    public Equipment getEquipmentById(int equId)
    {
        for (Equipment equipment : equipments)
        {
            if (equipment.getId() == equId)
            {
                return equipment;
            }
        }
        return null;
    }
    
    public Item getItemById(int itemId)
    {
        Bottle bottle = getBottleById(itemId);
        Equipment equipment = getEquipmentById(itemId);
        if (bottle != null)
        {
            return bottle;
        } else
        {
            return equipment;
        }
    }
    
    public void removeBottle(Bottle bottle)
    {
        if (bottle != null)
        {
            bottles.remove(bottle);
        }
    }
    
    public void removeEquipment(Equipment equipment)
    {
        if (equipment != null)
        {
            equipments.remove(equipment);
        }
    }
    
    public void removeItem(Item item)
    {
        if (item != null)
        {
            removeItemInBackpack(item);
            if (item instanceof Bottle)
            {
                removeBottle((Bottle) item);
            } else if (item instanceof Equipment)
            {
                removeEquipment((Equipment) item);
            }
        }
    }
    
    public boolean isInBackpack(Item item)
    {
        return backpack.contains(item);
    }
}