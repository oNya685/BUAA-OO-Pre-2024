import java.util.function.Consumer;

public class CreateAdventurer implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = (int) objects[0];
        String name = (String) objects[1];
        Adventurer newAdventurer = new Adventurer(advId, name);
        newAdventurer.setHitPoint(500);
        newAdventurer.setAtk(1);
        newAdventurer.setDef(0);
        World.getInstance().getAdventurers().add(newAdventurer);
    }
}
 