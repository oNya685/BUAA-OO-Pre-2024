import java.util.function.Consumer;

public class AddFragment implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        int fragId = ((int) objects[1]);
        String name = ((String) objects[2]);
        
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer ->
                {
                    Fragment fragment = new Fragment(fragId);
                    adventurer.gainFragment(name, fragment);
                });
    }
}
