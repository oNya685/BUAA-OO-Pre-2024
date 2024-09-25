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
    
    @Test
    public void addBottle()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        assertEquals(1, adventurer.getBottleCount());
        assertEquals(bottle, adventurer.getBottleById(10));
    }
    
    @Test
    public void getBottleCount()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        assertEquals(1, adventurer.getBottleCount());
    }
    
    @Test
    public void useBottle()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        adventurer.setHitPoint(20);
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        adventurer.carryItem(bottle);
        adventurer.useBottle(bottle);
        assertEquals(adventurer.getHitPoint(), 20 + bottle.getCapacity());
        assertEquals(bottle.isEmpty(), true);
        adventurer.useBottle(bottle);
        assertEquals(adventurer.getBottleById(10), null);
    }
    
    @Test
    public void addEquipment()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        assertEquals(1, adventurer.getEquipmentCount());
    }
    
    @Test
    public void getEquipmentCount()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        assertEquals(1, adventurer.getEquipmentCount());
    }
    
    @Test
    public void increaseEquipmentDurability()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        adventurer.increaseEquipmentDurability(0);
        assertEquals(1, equipment.getDurability());
    }
    
    @Test
    public void carryItem()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        adventurer.carryItem(bottle);
        adventurer.carryItem(equipment);
        assertEquals(adventurer.getEquipmentById(0), equipment);
        assertEquals(adventurer.getBottleById(10), bottle);
    }
    
    @Test
    public void removeItemInBackpack()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        adventurer.carryItem(equipment);
        assertEquals(adventurer.isInBackpack(equipment), true);
        adventurer.removeItemInBackpack(equipment);
        assertEquals(adventurer.isInBackpack(equipment), false);
    }
    
    @Test
    public void getBottleById()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        assertEquals(adventurer.getBottleById(10), bottle);
    }
    
    @Test
    public void getEquipmentById()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        assertEquals(adventurer.getEquipmentById(0), equipment);
    }
    
    @Test
    public void getItemById()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        assertEquals(adventurer.getItemById(0), equipment);
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        assertEquals(adventurer.getItemById(10), bottle);
    }
    
    @Test
    public void removeBottle()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        adventurer.carryItem(bottle);
        adventurer.removeBottle(bottle);
        assertEquals(adventurer.getItemById(10), null);
    }
    
    @Test
    public void removeEquipment()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        adventurer.carryItem(equipment);
        adventurer.removeEquipment(equipment);
        assertEquals(adventurer.getItemById(0), null);
    }
    
    @Test
    public void removeItem()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        adventurer.carryItem(equipment);
        Bottle bottle = new HpBottle(10, "HitPoint!", 100);
        adventurer.addBottle(bottle);
        adventurer.carryItem(equipment);
        assertEquals(adventurer.getItemById(10), bottle);
        adventurer.removeItem(bottle);
        assertEquals(adventurer.getBottleById(10), null);
        assertEquals(adventurer.getEquipmentById(0), equipment);
        adventurer.removeItem(equipment);
        assertEquals(adventurer.getEquipmentById(0), null);
    }
    
    @Test
    public void isInBackpack()
    {
        Adventurer adventurer = new Adventurer(37, "oNya");
        Equipment equipment = new Equipment(0, "Air Sword", 0);
        adventurer.addEquipment(equipment);
        assertEquals(adventurer.isInBackpack(equipment), false);
        adventurer.carryItem(equipment);
        assertEquals(adventurer.isInBackpack(equipment), true);
    }
}