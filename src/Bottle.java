public class Bottle extends Item
{
    private int capacity;
    private boolean empty;
    private int combatEffectiveness;
    
    public Bottle(int botId, String name, int capacity)
    {
        this.setId(botId);
        this.setName(name);
        this.capacity = capacity;
        this.empty = false;
    }
    
    public int getCapacity() { return capacity; }
    
    public boolean isEmpty() { return empty; }
    
    public int getCombatEffectiveness() { return combatEffectiveness; }
    
    public void setCombatEffectiveness(int combatEffectiveness)
    {
        this.combatEffectiveness = combatEffectiveness;
    }
    
    @Override
    public void information()
    {
        super.information();
        System.out.println(capacity);
    }
    
    public void use(Adventurer adventurer) { empty = true; }
}
