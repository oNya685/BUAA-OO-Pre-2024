public class DefBottle extends Bottle {
    public DefBottle(int botId, String name, int capacity) {
        super(botId, name, capacity);
    }

    @Override
    public int getCombatEffectiveness() {
        return super.getCombatEffectiveness();
    }

    @Override
    public void use(Adventurer adventurer) {
        super.use(adventurer);
        adventurer.setDef(adventurer.getDef() + getCombatEffectiveness() + getCapacity() / 100);
    }

    @Override
    public void information() {
        System.out.print("DefBottle" + " ");
        super.information();
    }
}