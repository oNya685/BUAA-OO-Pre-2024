import java.util.ArrayList;

public class Axe extends Equipment
{
    public Axe(int equId, String name, int durability) { super(equId, name, durability); }
    
    @Override
    public void information()
    {
        System.out.print("Axe" + " ");
        super.information();
    }
    
    @Override
    public void hurt(Adventurer attacker, ArrayList<Adventurer> targets)
    {
        for (Adventurer each : targets)
        {
            each.setHitPoint(each.getHitPoint() / 10);
        }
    }
}
