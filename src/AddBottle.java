//import java.util.Optional;
import java.util.function.Consumer;

public class AddBottle implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        int botId = ((int) objects[1]);
        String name = ((String) objects[2]);
        int capacity = ((int) objects[3]);
        String type = ((String) objects[4]);
        int combatEffectiveness = ((int) objects[5]);
        
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer ->
                        BottleFactory.get(type, botId, name, capacity)
                                .ifPresent(bottle ->
                                {
                                    bottle.setCombatEffectiveness(combatEffectiveness);
                                    adventurer.gainItem(bottle);
                                }));
    }
}
