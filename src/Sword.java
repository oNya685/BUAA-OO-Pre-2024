import java.util.ArrayList;

public class Sword extends Equipment
{
    public Sword(int botId, String name, int capacity)
    {
        super(botId, name, capacity);
    }
    
    @Override
    public void information()
    {
        System.out.print("Sword" + " ");
        super.information();
    }
    
    @Override
    public void hurt(Adventurer attacker, ArrayList<Adventurer> attacked)
    {
        for (Adventurer each : attacked)
        {
            int hitPointDecrease = getCombatEffectiveness() + attacker.getAtk() - each.getDef();
            each.setHitPoint(each.getHitPoint() - hitPointDecrease);
        }
    }
}
