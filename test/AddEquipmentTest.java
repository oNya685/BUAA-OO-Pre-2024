import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class AddEquipmentTest
{
    
    @Test
    public void accept()
    {
        CreateAdventurer createAdventurer = new CreateAdventurer();
        Object[] createAdventurerObjects = {123456, "tester"};
        createAdventurer.accept(createAdventurerObjects);
        
        AddEquipment addEquipment = new AddEquipment();
        Object[] addEquipmentAxeObjects = {123456, 1, "AXE", 100, "Axe", 50};
        Object[] addEquipmentBladeObjects = {123456, 2, "BLADE", 100, "Blade", 50};
        Object[] addEquipmentSwordObjects = {123456, 3, "SWORD", 1, "Sword", 50};
        addEquipment.accept(addEquipmentAxeObjects);
        addEquipment.accept(addEquipmentBladeObjects);
        addEquipment.accept(addEquipmentSwordObjects);
        
        World.getInstance().getAdventurerById(123456).ifPresent(adventurer ->
        {
            for (int i = 1; i <= 3; i++)
            {
                int finalI = i;
                adventurer.getItemInRepository(i).ifPresent(adventurerItem ->
                {
                    assertEquals(adventurerItem.getName(),
                            finalI == 1 ? "AXE" :
                                    finalI == 2 ? "BLADE" :
                                            "SWORD");
                    assertEquals(adventurerItem.getId(), finalI);
                    assertEquals(((Equipment) adventurerItem).getDurability(), finalI < 3 ? 100 : 1);
                    assertEquals(((Equipment) adventurerItem).getCombatEffectiveness(), 50);
                });
            }
        });
        
        Object[] createTargets1Objects = {111, "targets1"};
        Object[] createTargets2Objects = {222, "targets2"};
        Object[] createTargets3Objects = {333, "targets3"};
        String command = "1 112233 none";
        createAdventurer.accept(createTargets1Objects);
        createAdventurer.accept(createTargets2Objects);
        createAdventurer.accept(createTargets3Objects);
        CommandDispatcher.submit(command);
        
        Object[] combatObjects = {123456, "AXE", 3, 111, 222, 333};
        Combat combat = new Combat();
        combat.accept(combatObjects);
        
        World.getInstance().getAdventurerById(123456)
                .ifPresent(adventurer ->
                {
                    Axe axe = (Axe) adventurer.getItemInRepository(1).get();
                    Blade blade = (Blade) adventurer.getItemInRepository(2).get();
                    Sword sword = (Sword) adventurer.getItemInRepository(3).get();
                    
                    ArrayList<Adventurer> adventurers = new ArrayList<>();
                    World.getInstance().getAdventurerById(111).ifPresent(adventurers::add);
                    World.getInstance().getAdventurerById(222).ifPresent(adventurers::add);
                    World.getInstance().getAdventurerById(333).ifPresent(adventurers::add);
                    axe.hurt(adventurer, adventurers);
                    blade.hurt(adventurer, adventurers);
                    sword.hurt(adventurer, adventurers);
                    
                    
                    blade.information();
                    sword.information();
                    
                    adventurer.gainItem(axe);
                    adventurer.increaseEquipmentDurability(axe);
                    adventurer.increaseEquipmentDurability(axe.getId());
                    assertEquals(axe.getDurability(), 102);
                    
                    Object[] equipItemObjects = {123456, 1};
                    EquipItem equipItem = new EquipItem();
                    equipItem.accept(equipItemObjects);
                    
                    IncreaseDurability increaseDurability = new IncreaseDurability();
                    increaseDurability.accept(equipItemObjects);
                    
                    RemoveItem removeItem = new RemoveItem();
                    removeItem.accept(equipItemObjects);
                    
                    adventurer.decreaseEquipmentDurability(sword);
                    adventurer.decreaseEquipmentDurability(sword);
                    
                    adventurer.equipItem(axe.getId());
                    combat.accept(combatObjects);
                });
    }
}