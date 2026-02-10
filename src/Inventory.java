import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Inventory {
    public Map<UUID, Item> Items = new HashMap<>();

    public Map<UUID, Item> getItems() {
        return Items;
    }

    public void addItem(String name, String category, int quantity, String[] metadata) {
        Items.put(UUID.randomUUID(), new Item(name, category, quantity, metadata));
    }
}
