public class HpBottle extends Bottle
{
    public HpBottle(int botId, String name, int capacity)
    {
        super(botId, name, capacity);
    }
    
    @Override
    public int getCombatEffectiveness()
    {
        return 0;
    }
    
    @Override
    public void use(Adventurer adventurer)
    {
        super.use(adventurer);
        adventurer.setHitPoint(adventurer.getHitPoint() + getCapacity());
    }
    
    @Override
    public void information()
    {
        System.out.print("HpBottle" + " ");
        super.information();
    }
}
