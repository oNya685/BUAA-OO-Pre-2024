import java.util.ArrayList;
import java.util.function.Consumer;

public class Combat implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        String name = (String) objects[1];
        int k = ((int) objects[2]);
        ArrayList<Integer> targetsId = new ArrayList<>();
        for (int i = 0; i < k; i++)
        {
            targetsId.add((int) objects[3 + i]);
        }
        
        World.getInstance().getAdventurerById(advId)
                .ifPresent(attacker ->
                        attacker.getEquipmentInRepository(name).ifPresent(equipment ->
                        {
                            ArrayList<Adventurer> targets = new ArrayList<>();
                            for (int targetId : targetsId)
                            {
                                World.getInstance().getAdventurerById(targetId).
                                        ifPresent(targets::add);
                            }
                            if (
                                    attacker.isEquipped(equipment) &&
                                            attacker.getAtk() + equipment.getCombatEffectiveness() >
                                                    maxDef(targets)
                            )
                            {
                                equipment.hurt(attacker, targets);
                                attacker.decreaseEquipmentDurability(equipment);
                                for (Adventurer eachTarget : targets)
                                {
                                    System.out.println(
                                            eachTarget.getName() + " " + eachTarget.getHitPoint()
                                    );
                                }
                            }
                            else
                            {
                                System.out.println("Adventurer " + advId + " defeated");
                            }
                        }));
    }
    
    private int maxDef(ArrayList<Adventurer> targets)
    {
        int result = 0;
        for (Adventurer each : targets)
        {
            result = Math.max(result, each.getDef());
        }
        return result;
    }
}

