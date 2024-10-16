import java.util.ArrayList;

public class Blade extends Equipment
{
    public Blade(int botId, String name, int capacity)
    {
        super(botId, name, capacity);
    }
    
    @Override
    public void information()
    {
        System.out.print("Blade" + " ");
        super.information();
    }
    
    @Override
    public void hurt(Adventurer attacker, ArrayList<Adventurer> attacked)
    {
        for (Adventurer each : attacked)
        {
            int hitPointDecrease = getCombatEffectiveness() + attacker.getAtk();
            each.setHitPoint(each.getHitPoint() - hitPointDecrease);
        }
    }
}
