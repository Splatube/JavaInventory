import java.util.Arrays;

public class Item {
    final String name;
    final String category;
    int quantity;
    final String[] metadata;

    public Item(String name, String category, int quantity, String[] metadata) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.metadata = metadata;
    }

    @Override
    public String toString(){
        return "Item{name='" + name + "', category='" + category + "', quantity=" + quantity + ", metadata=" + Arrays.toString(metadata) + "}";
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
