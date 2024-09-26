import java.util.function.Consumer;

public class EquipItem implements Consumer<Object[]> {

    @Override
    public void accept(Object[] objects) {
        int advId = ((int) objects[0]);
        int itemId = ((int) objects[1]);

        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer -> adventurer.equipItem(itemId));
    }
}
