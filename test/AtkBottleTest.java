import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtkBottleTest
{
    AtkBottle atkBottle;
    
    @Before
    public void setUp()
    {
        atkBottle = new AtkBottle(10, "ATTACK", 1000);
        atkBottle.setCombatEffectiveness(20);
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        assertEquals(20, atkBottle.getCombatEffectiveness());
    }
    
    @Test
    public void use()
    {
        Adventurer adventurer = new Adventurer(114514, "oNya");
        adventurer.setAtk(10);
        atkBottle.use(adventurer);
        assertEquals(10 + 20 + 1000 / 100, adventurer.getAtk());
    }
}