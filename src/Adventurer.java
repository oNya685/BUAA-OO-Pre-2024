import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;

public class Adventurer implements CombatQueryable
{
    private final int id;
    private final String name;
    private int hitPoint;
    private int atk;
    private int def;
    private final HashSet<Item> repository;
    private final HashSet<Item> equippedItems;
    private final HashMap<String, HashSet<Fragment>> fragments;
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHitPoint()
    {
        return hitPoint;
    }
    
    public int getAtk()
    {
        return atk;
    }
    
    public int getDef()
    {
        return def;
    }
    
    @Override
    public int getCombatEffectiveness()
    {
        return atk + def;
    }
    
    public HashMap<String, HashSet<Fragment>> getFragments()
    {
        return fragments;
    }
    
    public HashSet<Fragment> getNeededFragments(String fragmentName)
    {
        return fragments.get(fragmentName);
    }
    
    public void setHitPoint(int hitPoint)
    {
        this.hitPoint = hitPoint;
    }
    
    public void setAtk(int atk)
    {
        this.atk = atk;
    }
    
    public void setDef(int def) { this.def = def; }
    
    public Adventurer(int advId, String name)
    {
        this.id = advId;
        this.name = name;
        this.repository = new HashSet<>();
        this.equippedItems = new HashSet<>();
        this.fragments = new HashMap<>();
    }
    
    public int getBottleCount()
    {
        return (int) this.repository.stream().filter(item -> item instanceof Bottle).count();
    }
    
    public void useBottle(Bottle bottle)
    {
        if (bottle.isEmpty())
        {
            removeItem(bottle);
        }
        else
        {
            bottle.use(this);
        }
    }
    
    public int getEquipmentCount()
    {
        return (int) this.repository.stream().filter(item -> item instanceof Equipment).count();
    }
    
    public void increaseEquipmentDurability(int equId)
    {
        getEquipmentInRepository(equId).ifPresent(this::increaseEquipmentDurability);
    }
    
    public void increaseEquipmentDurability(Equipment equipment)
    {
        equipment.setDurability(equipment.getDurability() + 1);
    }
    
    public void decreaseEquipmentDurability(Equipment equipment)
    {
        if (equipment.getDurability() > 0)
        {
            equipment.setDurability(equipment.getDurability() - 1);
        }
        if (equipment.getDurability() == 0)
        {
            removeItem(equipment);
            equipment.die();
        }
    }
    
    public void gainItem(Item item)
    {
        this.repository.add(item);
    }
    
    public void gainFragment(String fragmentName, Fragment fragment)
    {
        if (!this.fragments.containsKey(fragmentName))
        {
            this.fragments.put(fragmentName, new HashSet<>());
        }
        this.fragments.get(fragmentName).add(fragment);
    }
    
    public void equipItem(int itemID)
    {
        this.repository.stream().filter(item ->
                (item.getId() == itemID && !isEquipped(item))
        ).findFirst().ifPresent(item ->
        {
            if (item instanceof Bottle)
            {
                equipBottle((Bottle) item);
            } else if (item instanceof Equipment)
            {
                equipEquipment((Equipment) item);
            }
        });
    }
    
    private void equipBottle(Bottle bottle)
    {
        long count = this.equippedItems.stream()
                .filter(equippedItem ->
                        (equippedItem instanceof Bottle &&
                                Objects.equals(equippedItem.getName(), bottle.getName())))
                .count();
        if (count < this.getCombatEffectiveness() / 5 + 1)
        {
            addItemToBackpack(bottle);
        }
    }
    
    public void equipEquipment(Equipment equipment)
    {
        this.equippedItems.stream()
                .filter(equippedItem ->
                        (equippedItem instanceof Equipment &&
                                Objects.equals(equippedItem.getName(), equipment.getName())))
                .findFirst().ifPresent(this::removeItemInBackpack);
        addItemToBackpack(equipment);
    }
    
    public void addItemToBackpack(Item item)
    {
        this.equippedItems.add(item);
    }
    
    public void removeItemInBackpack(Item item)
    {
        this.equippedItems.remove(item);
    }
    
    public void removeItemInRepository(Item item)
    {
        repository.remove(item);
    }
    
    public Optional<Bottle> getBottleById(int botId)
    {
        return this.repository.stream().filter(item ->
                ((item instanceof Bottle) && item.getId() == botId)
        ).map(item -> (Bottle) item).findFirst();
    }
    
    public Optional<Equipment> getEquipmentInRepository(int equId)
    {
        return this.repository.stream().filter(item ->
                (item instanceof Equipment && item.getId() == equId)
        ).map(item -> (Equipment) item).findFirst();
    }
    
    public Optional<Equipment> getEquipmentInRepository(String name)
    {
        return this.repository.stream().filter(item ->
                (item instanceof Equipment && item.getName().equals(name))
        ).map(item -> (Equipment) item).findFirst();
    }
    
    public Optional<Item> getItemInRepository(int itemId)
    {
        return this.repository.stream().filter(item -> item.getId() == itemId).findFirst();
    }
    
    public void removeItem(Item item)
    {
        this.repository.remove(item);
        this.equippedItems.remove(item);
    }
    
    public boolean isInRepository(Item item)
    {
        return this.repository.contains(item);
    }
    
    public boolean isEquipped(Item item)
    {
        return this.equippedItems.contains(item);
    }
}