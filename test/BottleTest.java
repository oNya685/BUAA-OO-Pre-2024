import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BottleTest
{
    Bottle bottle;
    
    @Before
    public void setUp()
    {
        bottle = new Bottle(12, "HitPoint!", 2000);
    }
    
    @Test
    public void getCapacity()
    {
        assertEquals(bottle.getCapacity(), 2000);
    }
    
    @Test
    public void isEmpty()
    {
        Adventurer adventurer = new Adventurer(114514, "oNya");
        assertFalse(bottle.isEmpty());
        bottle.use(adventurer);
        assertTrue(bottle.isEmpty());
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        bottle.setCombatEffectiveness(10);
        assertEquals(bottle.getCombatEffectiveness(), 10);
    }
    
    @Test
    public void setCombatEffectiveness()
    {
        bottle.setCombatEffectiveness(10);
        assertEquals(bottle.getCombatEffectiveness(), 10);
    }
    
}