import org.junit.Test;

public class AddFragmentTest
{
    
    @Test
    public void accept()
    {
        CreateAdventurer createAdventurer = new CreateAdventurer();
        Object[] createAdventurerObjects = {123456, "tester"};
        createAdventurer.accept(createAdventurerObjects);
        
        Object[] addFragmentObjects1 = {123456, 111, "welfare_HpBottle"};
        Object[] addFragmentObjects2 = {123456, 222, "welfare_HpBottle"};
        Object[] addFragmentObjects3 = {123456, 333, "welfare_HpBottle"};
        Object[] addFragmentObjects4 = {123456, 444, "welfare_HpBottle"};
        Object[] addFragmentObjects5 = {123456, 555, "welfare_HpBottle"};
        Object[] addFragmentObjects6 = {123456, 666, "welfare_HpBottle"};
        
        AddFragment addFragment = new AddFragment();
        addFragment.accept(addFragmentObjects1);
        addFragment.accept(addFragmentObjects2);
        addFragment.accept(addFragmentObjects3);
        addFragment.accept(addFragmentObjects4);
        addFragment.accept(addFragmentObjects5);
        addFragment.accept(addFragmentObjects6);
        
        RedeemWelfare redeemWelfare = new RedeemWelfare();
        Object[] redeemWelfareObjects1 = {123456, "welfare_HpBottle", 12345};
        Object[] redeemWelfareObjects2 = {123456, "welfare_HpBottle", 6};
        redeemWelfare.accept(redeemWelfareObjects1);
        redeemWelfare.accept(redeemWelfareObjects2);
        
        World.getInstance().getAdventurerById(123456).ifPresent(adventurer -> {
            adventurer.getFragments();
        });
    }
}