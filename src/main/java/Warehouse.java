
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    
    public Warehouse() {
        productPrices = new HashMap<>();
        productStock = new HashMap<>();
    }
    
    public void addProduct(String name, int price, int stock) {
        productPrices.put(name, price);
        productStock.put(name, stock);
    }
    
    public int price(String product) {
        for (String item : productPrices.keySet()) {
            if (item.equals(product)) {
                return productPrices.get(item);
            }
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String item : productStock.keySet()) {
            if (item.equals(product)) {
                return productStock.get(item);
            }
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (stock(product) > 0) {
            int newStock = stock(product) - 1;
            productStock.put(product, newStock);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> keys = productPrices.keySet();
        return keys;
    }
    
}
