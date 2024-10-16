import java.util.Optional;

public class EquipmentFactory
{
    private EquipmentFactory() { }
    
    public static Optional<Equipment> get(String type, int equId, String name, int durability)
    {
        Optional<Equipment> result = Optional.empty();
        switch (type)
        {
            case "Axe":
                result = Optional.of(new Axe(equId, name, durability));
                break;
            case "Sword":
                result = Optional.of(new Sword(equId, name, durability));
                break;
            case "Blade":
                result = Optional.of(new Blade(equId, name, durability));
                break;
            default:
                break;
        }
        return result;
    }
}
