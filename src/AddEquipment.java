import java.util.function.Consumer;

public class AddEquipment implements Consumer<Object[]> {

    @Override
    public void accept(Object[] objects) {
        int advId = ((int) objects[0]);
        int equId = ((int) objects[1]);
        String name = ((String) objects[2]);
        int durability = ((int) objects[3]);
        int combatEffectiveness = ((int) objects[4]);

        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer -> {
                    Equipment newEquipment = new Equipment(equId, name, durability);
                    newEquipment.setCombatEffectiveness(combatEffectiveness);
                    adventurer.gainItem(newEquipment);
                });
    }
}
