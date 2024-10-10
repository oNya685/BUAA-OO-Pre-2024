public class Equipment extends Item implements CombatQueryable
{
    private int durability;
    private int combatEffectiveness;
    
    public Equipment(int equId, String name, int durability)
    {
        super(equId, name);
        this.durability = durability;
    }
    
    public int getDurability()
    {
        return durability;
    }
    
    @Override
    public int getCombatEffectiveness()
    {
        return combatEffectiveness;
    }
    
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