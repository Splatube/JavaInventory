import java.util.Arrays;

public class Main {;
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem("stick", "Stick", "nature", 3, new String[]{"wooden", "oak"});
        inventory.addItem("pebble", "Pebble", "nature", 2, new String[]{"stone", "throwable"});
        System.out.println(inventory);

        inventory.addItem("pebble", "Pebble", "nature", 3, new String[]{"stone", "throwable"});
        inventory.addItem("stone_sword", "Stone sword", "tools", 1, new String[]{"stone", "weapon", "breakable"});
        System.out.println(inventory);

        inventory.removeItem("stick");
        inventory.addItemQuantity("pebble", -1);
        inventory.items.get("stone_sword").addQuantity(-1);
        System.out.println(inventory);

        inventory.addItem("stick", "Stick", "nature", 3, new String[]{"wooden", "oak"});
        inventory.items.get("stick").setQuantity(7);
        System.out.println(inventory);
    }
}