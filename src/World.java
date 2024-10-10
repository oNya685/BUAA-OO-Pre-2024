import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class World
{
    private static final World instance = new World();
    private final ArrayList<Adventurer> adventurers = new ArrayList<>();
    private final HashSet<Item> itemPool = new HashSet<>();
    
    public static World getInstance()
    {
        return instance;
    }
    
    public ArrayList<Adventurer> getAdventurers()
    {
        return adventurers;
    }
    
    public Optional<Adventurer> getAdventurerById(int id)
    {
        return adventurers.stream().filter(adventurer -> adventurer.getId() == id).findFirst();
    }
    
    public Optional<Item> getItem(int id)
    {
        return itemPool.stream().filter(item -> item.getId() == id).findFirst();
    }
    
    public HashSet<Item> getItemPool()
    {
        return itemPool;
    }
}
