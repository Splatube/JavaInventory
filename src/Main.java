public class Main {;
    Inventory inventory = new Inventory();
    void main() {
        inventory.addItem("stick", "Stick", "nature", 3, new String[]{"wooden", "oak"});
        inventory.addItem("pebble", "Pebble", "nature", 2, new String[]{"stone", "throwable"});
        System.out.println(inventory);

        inventory.addItem("pebble", "Pebble", "nature", 3, new String[]{"stone", "throwable"});
        inventory.addItem("stone_sword", "Stone sword", "tools", 1, new String[]{"stone", "weapon", "breakable"});
        System.out.println(inventory);

        inventory.removeItem("stick");
        inventory.removeItem("pebble", 3);
        inventory.removeItem("stone_sword", 1);
        System.out.println(inventory);
    }
}