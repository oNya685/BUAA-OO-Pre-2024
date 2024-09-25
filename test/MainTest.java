import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {
    
    private ArrayList<Adventurer> adventurers;
    
    @Before
    public void setUp() {
        adventurers = new ArrayList<>();
    }
    
    @Test
    public void testCreateAdventurer() {
        String[] strings = {"1", "101", "John"};
        Main.createAdventurer(strings, adventurers);
        
        assertEquals(1, adventurers.size());
        Adventurer adventurer = adventurers.get(0);
        assertEquals(101, adventurer.getId());
        assertEquals("John", adventurer.getName());
        assertEquals(500, adventurer.getHitPoint());
        assertEquals(1, adventurer.getAtk());
        assertEquals(0, adventurer.getDef());
    }
    
    @Test
    public void testAddBottle() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        
        String[] bottleStrings = {"2", "101", "201", "HealthPotion", "100", "HpBottle", "50"};
        Main.addBottle(bottleStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        assertNotNull(adventurer);
        assertEquals(1, adventurer.getBottleCount());
        
        Bottle bottle = adventurer.getBottleById(201);
        assertNotNull(bottle);
        assertTrue(bottle instanceof HpBottle);
        assertEquals("HealthPotion", bottle.getName());
        assertEquals(100, bottle.getCapacity());
    }
    
    @Test
    public void testAddEquipment() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        
        String[] equipmentStrings = {"3", "101", "301", "Sword", "200", "150"};
        Main.addEquipment(equipmentStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        assertNotNull(adventurer);
        assertEquals(1, adventurer.getEquipmentCount());
        
        Equipment equipment = adventurer.getEquipmentById(301);
        assertNotNull(equipment);
        assertEquals("Sword", equipment.getName());
        assertEquals(200, equipment.getDurability());
    }
    
    @Test
    public void testIncreaseDurability() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        String[] equipmentStrings = {"3", "101", "301", "Sword", "200", "150"};
        Main.addEquipment(equipmentStrings, adventurers);
        
        String[] increaseDurabilityStrings = {"4", "101", "301"};
        Main.increaseDurability(increaseDurabilityStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        Equipment equipment = null;
        if (adventurer != null)
        {
            equipment = adventurer.getEquipmentById(301);
        }
        assertNotNull(equipment);
        assertEquals(201, equipment.getDurability());  // Durability should have increased
    }
    
    @Test
    public void testRemoveItem() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        String[] bottleStrings = {"2", "101", "201", "HealthPotion", "100", "HpBottle", "50"};
        Main.addBottle(bottleStrings, adventurers);
        
        String[] removeItemStrings = {"5", "101", "201"};
        Main.removeItem(removeItemStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        if (adventurer != null)
        {
            assertEquals(0, adventurer.getBottleCount());  // The bottle should be removed
        }
    }
    
    @Test
    public void testUseBottle() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        String[] bottleStrings = {"2", "101", "201", "HealthPotion", "100", "HpBottle", "50"};
        Main.addBottle(bottleStrings, adventurers);
        
        String[] useBottleStrings = {"7", "101", "201"};
        Main.useBottle(useBottleStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        if (adventurer != null)
        {
            assertEquals(500, adventurer.getHitPoint());  // Assuming bottle effect was applied
        }
    }
    
    @Test
    public void testGetAdventurerById() {
        String[] createStrings = {"1", "101", "John"};
        Main.createAdventurer(createStrings, adventurers);
        
        Adventurer adventurer = Main.getAdventurerById(adventurers, 101);
        assertNotNull(adventurer);
        assertEquals(101, adventurer.getId());
    }
}
