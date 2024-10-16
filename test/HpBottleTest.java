import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HpBottleTest
{
    HpBottle hpBottle;
    
    @Before
    public void setUp()
    {
        hpBottle = new HpBottle(10, "HitPoint", 1000);
        hpBottle.setCombatEffectiveness(0);
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        assertEquals(0, hpBottle.getCombatEffectiveness());
    }
    
    @Test
    public void use()
    {
        Adventurer adventurer = new Adventurer(114514, "oNya");
        adventurer.setHitPoint(10);
        hpBottle.use(adventurer);
        assertEquals(10 + 1000, adventurer.getHitPoint());
    }
}