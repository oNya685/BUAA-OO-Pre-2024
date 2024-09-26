import java.util.function.Consumer;

public class IncreaseDurability implements Consumer<Object[]> {

    @Override
    public void accept(Object[] objects) {
        int advId = ((int) objects[0]);
        int equId = ((int) objects[1]);
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer -> {
                    adventurer.increaseEquipmentDurability(equId);
                    adventurer.getEquipmentById(equId)
                            .ifPresent(equipment -> System.out.println(equipment.getName() + " " + equipment.getDurability()));
                });
    }
}
