import java.util.function.Consumer;

public class AddEquipment implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        int equId = ((int) objects[1]);
        String name = ((String) objects[2]);
        int durability = ((int) objects[3]);
        String type = ((String) objects[4]);
        int combatEffectiveness = ((int) objects[5]);
        
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer ->
                        EquipmentFactory.get(type, equId, name, durability)
                                .ifPresent(equipment ->
                                {
                                    equipment.setCombatEffectiveness(combatEffectiveness);
                                    adventurer.gainItem(equipment);
                                }));
    }
}
