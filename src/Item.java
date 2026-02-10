import java.util.Arrays;
import java.util.UUID;

public class Item {
    private final String name;
    private final String category;
    private int quantity;
    private final String[] metadata;

    public Item(String name, String category, int quantity, String[] metadata) {
        this.name = name;
        this.category = category;
        this.metadata = metadata;
    }

    @Override
    public String toString(){
        return "Item{name='" + name + "', category='" + category + "', quantity=" + quantity + ", metadata=" + Arrays.toString(metadata) + "}";
    }
}
