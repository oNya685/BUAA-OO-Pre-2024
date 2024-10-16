import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventurerTest
{
    @Before
    public void setUp() throws Exception
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
    }
    
    @Test
    public void getId()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        assertEquals(37, adventurer.getId());
    }
    
    @Test
    public void getName()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        assertEquals("oNya", adventurer.getName());
    }
    
    @Test
    public void getHitPoint()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setHitPoint(20);
        assertEquals(20, adventurer.getHitPoint());
    }
    
    @Test
    public void getAtk()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setAtk(10);
        assertEquals(10, adventurer.getAtk());
    }
    
    @Test
    public void getDef()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setDef(10);
        assertEquals(10, adventurer.getDef());
    }
    
    @Test
    public void getCombatEffectiveness()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setAtk(10);
        adventurer.setDef(10);
        assertEquals(20, adventurer.getCombatEffectiveness());
    }
    
    @Test
    public void setHitPoint()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setHitPoint(20);
        assertEquals(20, adventurer.getHitPoint());
    }
    
    @Test
    public void setAtk()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setAtk(10);
        assertEquals(10, adventurer.getAtk());
    }
    
    @Test
    public void setDef()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setDef(10);
        assertEquals(10, adventurer.getDef());
    }
}