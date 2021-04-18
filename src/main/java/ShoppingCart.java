
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!cart.keySet().contains(product)) {
            Item item = new Item(product, 1, price);
            cart.put(product, item);
        } else {
            cart.get(product).increaseQuantity();
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }

}
