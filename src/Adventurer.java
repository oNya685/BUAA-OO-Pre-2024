import java.util.HashSet;
import java.util.Optional;

public class Adventurer implements CombatQueryable {
    private final int id;
    private final String name;
    private int hitPoint;
    private int atk;
    private int def;
    private final HashSet<Item> repository;
    private final HashSet<Item> equippedItems;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    @Override
    public int getCombatEffectiveness() {
        return atk + def;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Adventurer(int advId, String name) {
        this.id = advId;
        this.name = name;
        this.repository = new HashSet<>();
        this.equippedItems = new HashSet<>();
    }

    public int getBottleCount() {
        return (int) this.repository.stream().filter(item -> item instanceof Bottle).count();
    }

    public void useBottle(Bottle bottle) {
        if (bottle.isEmpty()) {
            removeItem(bottle);
        } else {
            bottle.use(this);
        }
    }

    public int getEquipmentCount() {
        return (int) this.repository.stream().filter(item -> item instanceof Equipment).count();
    }

    public void increaseEquipmentDurability(int equId) {
        getEquipmentById(equId).ifPresent(equipment -> equipment.setDurability(equipment.getDurability() + 1));
    }

    public void gainItem(Item item) {
        this.repository.add(item);
    }

    public void equipItem(int itemID) {
        this.repository.stream().filter(item -> item.getId() == itemID)
                .findFirst()
                .ifPresent(this.equippedItems::add);
    }

    public void equipItem(Item item) {
        if (this.isInBackpack(item)) {
            this.equippedItems.add(item);
        }
    }

    public void removeItemInBackpack(Item item) {
        repository.remove(item);
    }

    public Optional<Bottle> getBottleById(int botId) {
        return this.repository.stream()
                .filter(item -> ((item instanceof Bottle) && item.getId() == botId))
                .map(item -> (Bottle) item)
                .findFirst();
    }

    public Optional<Equipment> getEquipmentById(int equId) {
        return this.repository.stream()
                .filter(item -> (item instanceof Equipment && item.getId() == equId))
                .map(item -> (Equipment) item)
                .findFirst();
    }

    public Optional<Item> getItemById(int itemId) {
        return this.repository.stream().filter(item -> item.getId() == itemId).findFirst();
    }

    public void removeItem(Item item) {
        this.repository.remove(item);
        this.equippedItems.remove(item);
    }

    public boolean isInBackpack(Item item) {
        return this.repository.contains(item);
    }

    public boolean isEquipped(Item item) {
        return this.equippedItems.contains(item);
    }
}