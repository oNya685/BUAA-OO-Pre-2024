import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Adventurer> adventurers = new ArrayList<>();
        
        int n = Integer.parseInt(scanner.nextLine().trim());
        
        for (int i = 0; i < n; ++i) {
            String nextLine = scanner.nextLine();
            String[] strings = nextLine.trim().split(" +");
            int type = Integer.parseInt(strings[0]);
            
            switch (type) {
                case 1:
                    createAdventurer(strings, adventurers);
                    break;
                case 2:
                    addBottle(strings, adventurers);
                    break;
                case 3:
                    addEquipment(strings, adventurers);
                    break;
                case 4:
                    increaseDurability(strings, adventurers);
                    break;
                case 5:
                    removeBottle(strings, adventurers);
                    break;
                case 6:
                    removeEquipment(strings, adventurers);
                    break;
                default:
                    System.out.println("Unknown operation");
            }
        }
    }
    
    private static void createAdventurer(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        String name = strings[2];
        Adventurer newAdventurer = new Adventurer(advId, name);
        adventurers.add(newAdventurer);
    }
    
    private static void addBottle(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        int botId = Integer.parseInt(strings[2]);
        String name = strings[3];
        int capacity = Integer.parseInt(strings[4]);
        Adventurer adventurer = getAdventurerById(adventurers, advId);
        if (adventurer != null) {
            adventurer.addBottle(new Bottle(botId, name, capacity));
        }
    }
    
    private static void addEquipment(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        int equId = Integer.parseInt(strings[2]);
        String name = strings[3];
        int durability = Integer.parseInt(strings[4]);
        Adventurer adventurer = getAdventurerById(adventurers, advId);
        if (adventurer != null) {
            adventurer.addEquipment(new Equipment(equId, name, durability));
        }
    }
    
    private static void increaseDurability(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        int equId = Integer.parseInt(strings[2]);
        Adventurer adventurer = getAdventurerById(adventurers, advId);
        if (adventurer != null) {
            adventurer.increaseEquipmentDurability(equId);
            Equipment equipment = adventurer.getEquipmentById(equId);
            if (equipment != null) {
                System.out.println(equipment.getName() + " "
                        + equipment.getDurability());
            }
        }
    }
    
    private static void removeBottle(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        int botId = Integer.parseInt(strings[2]);
        Adventurer adventurer = getAdventurerById(adventurers, advId);
        if (adventurer != null) {
            Bottle b = adventurer.getBottleById(botId);
            adventurer.removeBottle(b);
            System.out.println(adventurer.getBottleCount() + " "
                    + b.getName() + " "
                    + b.getCapacity());
        }
    }
    
    private static void removeEquipment(String[] strings, ArrayList<Adventurer> adventurers) {
        int advId = Integer.parseInt(strings[1]);
        int equId = Integer.parseInt(strings[2]);
        Adventurer adventurer = getAdventurerById(adventurers, advId);
        if (adventurer != null) {
            Equipment e = adventurer.getEquipmentById(equId);
            adventurer.removeEquipment(e);
            System.out.println(adventurer.getEquipmentCount() + " "
                    + e.getName() + " "
                    + e.getDurability());
        }
    }
    
    public static Adventurer getAdventurerById(ArrayList<Adventurer> adventurers, int advId) {
        for (Adventurer adventurer : adventurers) {
            if (adventurer.getId() == advId) {
                return adventurer;
            }
        }
        return null;
    }
}
