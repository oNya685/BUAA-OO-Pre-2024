import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AdventurerTest {
    private Adventurer adventurer;
    private Bottle bottle;
    private Equipment equipment;
    
    @Before
    public void setUp() {
        adventurer = new Adventurer(1, "Test Adventurer");
        bottle = new Bottle(1, "Healing Potion", 100);
        equipment = new Equipment(1, "Sword", 10);
    }
    
    @Test
    public void testAddBottle() {
        adventurer.addBottle(bottle);
        assertEquals(1, adventurer.getBottleCount());
        assertEquals(bottle, adventurer.getBottleById(1));
    }
    
    @Test
    public void testRemoveBottle() {
        adventurer.addBottle(bottle);
        adventurer.removeBottle(bottle);
        assertEquals(0, adventurer.getBottleCount());
        assertNull(adventurer.getBottleById(1));
    }
    
    @Test
    public void testAddEquipment() {
        adventurer.addEquipment(equipment);
        assertEquals(1, adventurer.getEquipmentCount());
        assertEquals(equipment, adventurer.getEquipmentById(1));
    }
    
    @Test
    public void testRemoveEquipment() {
        adventurer.addEquipment(equipment);
        adventurer.removeEquipment(equipment);
        assertEquals(0, adventurer.getEquipmentCount());
        assertNull(adventurer.getEquipmentById(1));
    }
    
    @Test
    public void testIncreaseEquipmentDurability() {
        adventurer.addEquipment(equipment);
        adventurer.increaseEquipmentDurability(1);
        assertEquals(11, equipment.getDurability());
    }
    
    @Test
    public void testGetAdventurerById() {
        ArrayList<Adventurer> adventurers = new ArrayList<>();
        adventurers.add(adventurer);
        Adventurer foundAdventurer = Main.getAdventurerById(adventurers, 1);
        assertEquals(adventurer, foundAdventurer);
    }
    
    @Test
    public void testInvalidOperations() {
        ArrayList<Adventurer> adventurers = new ArrayList<>();
        adventurers.add(adventurer);
        
        // Invalid adventurer ID
        Adventurer foundAdventurer = Main.getAdventurerById(adventurers, 999);
        assertNull(foundAdventurer);
        
        // Invalid bottle ID
        Bottle foundBottle = adventurer.getBottleById(999);
        assertNull(foundBottle);
        
        // Invalid equipment ID
        Equipment foundEquipment = adventurer.getEquipmentById(999);
        assertNull(foundEquipment);
    }
}