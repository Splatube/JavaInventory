public class Main {;
    Inventory inventory = new Inventory();
    void main() {
        inventory.addItem("stick", "nature", 3, new String[]{"wooden", "oak"});
        inventory.addItem("pebble", "nature", 2, new String[]{"stone", "throwable"});
        System.out.println(inventory.getItems());
    }
}