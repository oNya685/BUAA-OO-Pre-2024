import java.util.HashSet;
import java.util.Iterator;

public class WelfareShop
{
    public static boolean haveEnoughNeededFragments(
            HashSet<Fragment> neededFragments, int neededAmount
    )
    {
        if (neededFragments != null)
        {
            return neededFragments.size() >= neededAmount;
        }
        return false;
    }
    
    public static void redeemNewHpBottle(Adventurer adventurer, String fragmentName, int welfareId)
    {
        BottleFactory.get("HpBottle", welfareId, fragmentName, 100).ifPresent(adventurer::gainItem);
    }
    
    public static void decreaseNeededFragments(
            HashSet<Fragment> neededFragments, int decreaseAmount
    )
    {
        Iterator<Fragment> iterator = neededFragments.iterator();
        for (int i = 0; i < decreaseAmount && iterator.hasNext(); i++)
        {
            iterator.next();
            iterator.remove();
        }
    }
}
