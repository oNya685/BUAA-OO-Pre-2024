import java.util.HashSet;
import java.util.function.Consumer;

public class RedeemWelfare implements Consumer<Object[]>
{
    @Override
    public void accept(Object[] objects)
    {
        int advId = ((int) objects[0]);
        String name = (String) objects[1];
        int welfareId = ((int) objects[2]);
        
        World.getInstance().getAdventurerById(advId)
                .ifPresent(adventurer ->
                {
                    HashSet<Fragment> neededFragments = adventurer.getNeededFragments(name);
                    if (neededFragments != null)
                    {
                        if (WelfareShop.haveEnoughNeededFragments(neededFragments, 5))
                        {
                            WelfareShop.decreaseNeededFragments(neededFragments, 5);
                            offerWelfare(adventurer, name, welfareId);
                        }
                        else
                        {
                            System.out.println(neededFragments.size() +
                                    ": Not enough fragments collected yet");
                        }
                    }
                });
    }
    
    private void offerWelfare(Adventurer adventurer, String fragmentName, int welfareId)
    {
        adventurer.getItemInRepository(welfareId).ifPresent(welfareItem ->
        {
            if (welfareItem instanceof Bottle)
            {
                ((Bottle) welfareItem).fill();
                System.out.println(
                        welfareItem.getName() + " " + ((Bottle) welfareItem).getCapacity()
                );
            }
            else if (welfareItem instanceof Equipment)
            {
                adventurer.increaseEquipmentDurability((Equipment) welfareItem);
                System.out.println(
                        welfareItem.getName() + " " + ((Equipment) welfareItem).getDurability()
                );
            }
        });
        adventurer.getItemInRepository(welfareId).orElseGet(() ->
        {
            WelfareShop.redeemNewHpBottle(adventurer, fragmentName, welfareId);
            System.out.println("Congratulations! HpBottle " + fragmentName + " acquired");
            return null;
        });
    }
}
