import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    final Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void addItem(String id, String name, String category, int quantity, String[] metadata) {
        if (items.toString().contains(name)) {
            for (Map.Entry<String, Item> item : items.entrySet()) {
                if (item.getKey().equals(id)) {
                    item.getValue().addQuantity(quantity);
                }
            }
        } else {
            items.put(id, new Item(name, category, quantity, metadata));
        }
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public void setItemQuantity(String id, int quantity) {
        if (items.containsKey(id)) {
            items.get(id).setQuantity(quantity);
        }
    }

    public void addItemQuantity(String id, int quantity) {
        if (items.containsKey(id)) {
            items.get(id).addQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        return this.items.toString().substring(1,items.toString().length()-1);
    }
}
