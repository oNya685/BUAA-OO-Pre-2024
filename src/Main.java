import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            CommandDispatcher.submit(command);
        }
    }

//    static void createAdventurer(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        String name = strings[2];
//        Adventurer newAdventurer = new Adventurer(advId, name);
//        newAdventurer.setHitPoint(500);
//        newAdventurer.setAtk(1);
//        newAdventurer.setDef(0);
//        adventurers.add(newAdventurer);
//    }

//    static void addBottle(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int botId = Integer.parseInt(strings[2]);
//        String name = strings[3];
//        int capacity = Integer.parseInt(strings[4]);
//        String type = strings[5];
//        int combatEffectiveness = Integer.parseInt(strings[6]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//        Bottle newBottle;
//        if (adventurer != null) {
//            switch (type) {
//                case "HpBottle":
//                    newBottle = new HpBottle(botId, name, capacity);
//                    break;
//                case "AtkBottle":
//                    newBottle = new AtkBottle(botId, name, capacity);
//                    break;
//                case "DefBottle":
//                    newBottle = new DefBottle(botId, name, capacity);
//                    break;
//                default:
//                    return;
//            }
//            newBottle.setCombatEffectiveness(combatEffectiveness);
//            adventurer.addBottle(newBottle);
//        }
//    }

//    static void addEquipment(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int equId = Integer.parseInt(strings[2]);
//        String name = strings[3];
//        int durability = Integer.parseInt(strings[4]);
//        int combatEffectiveness = Integer.parseInt(strings[5]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//        if (adventurer != null) {
//            Equipment newEquipment = new Equipment(equId, name, durability);
//            newEquipment.setCombatEffectiveness(combatEffectiveness);
//            adventurer.addEquipment(new Equipment(equId, name, durability));
//        }
//    }
//
//    static void increaseDurability(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int equId = Integer.parseInt(strings[2]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//        if (adventurer != null) {
//            adventurer.increaseEquipmentDurability(equId);
//            Equipment equipment = adventurer.getEquipmentById(equId);
//            if (equipment != null) {
//                System.out.println(equipment.getName() + " "
//                        + equipment.getDurability());
//            }
//        }
//    }
//
//
//    static void removeItem(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int itemId = Integer.parseInt(strings[2]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//
//        Item item = null;
//        if (adventurer != null) {
//            item = adventurer.getItemById(itemId);
//        }
//        if (item != null) {
//            item.information();
//        }
//        if (adventurer != null) {
//            adventurer.removeItem(item);
//        }
//    }
//
//    private static void carryItem(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int itemId = Integer.parseInt(strings[2]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//
//        Item item;
//        if (adventurer != null) {
//            item = adventurer.getItemById(itemId);
//            adventurer.carryItem(item);
//        }
//    }
//
//    static void useBottle(String[] strings, ArrayList<Adventurer> adventurers) {
//        int advId = Integer.parseInt(strings[1]);
//        int botId = Integer.parseInt(strings[2]);
//        Adventurer adventurer = getAdventurerById(adventurers, advId);
//        Bottle bottle = null;
//        if (adventurer != null) {
//            bottle = adventurer.getBottleById(botId);
//        }
//        if (bottle != null) {
//            if (adventurer.isInBackpack(bottle)) {
//                adventurer.useBottle(bottle);
//                System.out.println(adventurer.getName() + " " +
//                        adventurer.getHitPoint() + " " +
//                        adventurer.getAtk() + " " +
//                        adventurer.getDef());
//            } else {
//                System.out.println(adventurer.getName() + " " +
//                        "fail to use" + " " +
//                        bottle.getName());
//            }
//        }
//    }
//
//    public static Adventurer getAdventurerById(ArrayList<Adventurer> adventurers, int advId) {
//        for (Adventurer adventurer : adventurers) {
//            if (adventurer.getId() == advId) {
//                return adventurer;
//            }
//        }
//        return null;
//    }
}
