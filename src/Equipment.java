public class Equipment extends Item implements CombatEffectiveness
{
    private int durability;
    private int combatEffectiveness;
    
    public Equipment(int equId, String name, int durability)
    {
        this.setId(equId);
        this.setName(name);
        this.durability = durability;
    }
    
    public int getDurability()
    {
        return durability;
    }
    
    @Override
    public int getCombatEffectiveness() { return combatEffectiveness; }
    
    public void setDurability(int durability)
    {
        this.durability = durability;
    }
    
    public void setCombatEffectiveness(int combatEffectiveness)
    {
        this.combatEffectiveness = combatEffectiveness;
    }
    
    @Override
    public void information()
    {
        System.out.print("Equipment" + " ");
        super.information();
        System.out.println(durability);
    }
}