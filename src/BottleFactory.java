import java.util.Optional;

public class BottleFactory
{
    private BottleFactory() { }
    
    public static Optional<Bottle> get(String type, int botId, String name, int capacity)
    {
        Optional<Bottle> result = Optional.empty();
        switch (type)
        {
            case "HpBottle":
                result = Optional.of(new HpBottle(botId, name, capacity));
                break;
            case "AtkBottle":
                result = Optional.of(new AtkBottle(botId, name, capacity));
                break;
            case "DefBottle":
                result = Optional.of(new DefBottle(botId, name, capacity));
                break;
            default:
                break;
        }
        return result;
    }
}
