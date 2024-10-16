import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBottleTest
{
    @Test
    public void accept()
    {
        CreateAdventurer adventurer = new CreateAdventurer();
        Object[] objects1 = {123456, "123"};
        adventurer.accept(objects1);
        Object[] objects = {123456, 123, "defBot", 100, "DefBottle", 22};
        Object[] objects2 = {123456, 234, "atkBot", 100, "AtkBottle", 22};
        Object[] objects3 = {123456, 345, "hpBot", 100, "HpBottle", 0};
        AddBottle addBottle = new AddBottle();
        addBottle.accept(objects);
        Bottle bottle = World.getInstance().getAdventurerById(123456).flatMap(adventurerById -> adventurerById.getBottleById(123)).orElse(null);
        bottle.information();
        Adventurer adventurer1 = World.getInstance().getAdventurerById(123456).get();
        adventurer1.getBottleCount();
        adventurer1.getEquipmentCount();
        adventurer1.equipItem(bottle.getId());
        adventurer1.useBottle(bottle);
        
        assertNotNull(bottle);
        assertEquals(bottle.getId(), 123);
        assertEquals(bottle.getName(), "defBot");
        assertEquals(bottle.getClass(), DefBottle.class);
        assertEquals(bottle.getCapacity(), 100);
        assertEquals(bottle.getCombatEffectiveness(), 22);
        
        bottle.die();
        assertNull(World.getInstance().getItem(123).orElse(null));
        
        addBottle.accept(objects3);
        addBottle.accept(objects2);
        Bottle bottle1 = World.getInstance().getAdventurerById(123456).flatMap(adventurerById -> adventurerById.getBottleById(234)).orElse(null);
        Bottle bottle2 = World.getInstance().getAdventurerById(123456).flatMap(adventurerById -> adventurerById.getBottleById(345)).orElse(null);
        bottle1.information();
        bottle2.information();
        
        Object[] objects4 = {123456, 234};
        UseBottle useBottle = new UseBottle();
        useBottle.accept(objects4);
        adventurer1.equipItem(bottle1.getId());
        adventurer1.equipItem(bottle1.getId());
        adventurer1.useBottle(bottle1);
        adventurer1.useBottle(bottle1);
        adventurer1.equipItem(bottle2.getId());
        adventurer1.removeItemInBackpack(bottle2);
        adventurer1.removeItemInRepository(bottle2);
        adventurer1.removeItem(bottle2);
    }
}