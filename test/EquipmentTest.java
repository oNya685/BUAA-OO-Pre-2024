import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EquipmentTest
{
    Equipment equipment;
    
    @Before
    public void setUp()
    {
        equipment = new Equipment(0, "Java", 1);
    }
    
    @Test
    public void getDurability()
    {
        assertEquals(1, equipment.getDurability());
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        equipment.setCombatEffectiveness(1);
        assertEquals(1, equipment.getCombatEffectiveness());
    }
    
    @Test
    public void setDurability()
    {
        equipment.setDurability(2);
        assertEquals(2, equipment.getDurability());
    }
    
    @Test
    public void setCombatEffectiveness()
    {
        equipment.setCombatEffectiveness(1);
        assertEquals(1, equipment.getCombatEffectiveness());
    }
}