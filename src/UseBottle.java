//import java.util.Optional;

import java.util.function.Consumer;

public class UseBottle implements Consumer<Object[]>
{
    
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        int botId = ((int) objects[1]);
        World world = World.getInstance();
        world.getItem(botId)
                .ifPresent(item ->
                {
                    Bottle bottle = ((Bottle) item);
                    world.getAdventurerById(advId)
                            .ifPresent(adventurer ->
                            {
                                if (adventurer.isEquipped(bottle))
                                {
                                    adventurer.useBottle(bottle);
                                    System.out.println(adventurer.getName() + " " +
                                            adventurer.getHitPoint() + " " +
                                            adventurer.getAtk() + " " +
                                            adventurer.getDef());
                                }
                                else
                                {
                                    System.out.println(adventurer.getName() + " " +
                                            "fail to use" + " " +
                                            bottle.getName());
                                }
                            });
                });
    }
}
