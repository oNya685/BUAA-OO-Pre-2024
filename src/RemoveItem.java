import java.util.Optional;
import java.util.function.Consumer;

public class RemoveItem implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        int itemId = ((int) objects[1]);
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer ->
                {
                    Optional<Item> itemOptional = adventurer.getItemById(itemId);
                    itemOptional.ifPresent(item ->
                    {
                        item.information();
                        adventurer.removeItem(item);
                    });
                });
    }
}
