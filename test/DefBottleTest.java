import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefBottleTest
{
    DefBottle defBottle;
    
    @Before
    public void setUp()
    {
        defBottle = new DefBottle(10, "DEFEND", 1000);
        defBottle.setCombatEffectiveness(20);
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        assertEquals(20, defBottle.getCombatEffectiveness());
    }
    
    @Test
    public void use()
    {
        Adventurer adventurer = new Adventurer(114514, "oNya");
        adventurer.setDef(10);
        defBottle.use(adventurer);
        assertEquals(10 + 20 + 1000 / 100, adventurer.getDef());
    }
}