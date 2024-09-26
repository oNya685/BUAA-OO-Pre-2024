public class AtkBottle extends Bottle {
    public AtkBottle(int botId, String name, int capacity) {
        super(botId, name, capacity);
    }

    @Override
    public int getCombatEffectiveness() {
        return super.getCombatEffectiveness();
    }

    @Override
    public void use(Adventurer adventurer) {
        super.use(adventurer);
        adventurer.setAtk(adventurer.getAtk() + getCombatEffectiveness() + getCapacity() / 100);
    }

    @Override
    public void information() {
        System.out.print("AtkBottle" + " ");
        super.information();
    }
}