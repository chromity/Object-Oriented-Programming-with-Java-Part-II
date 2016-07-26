
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> storage;
    private Map<String, Integer> itemPrices;

    public Storehouse() {
        this.storage = new HashMap<String, Integer>();
        this.itemPrices = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, stock);
        this.itemPrices.put(product, price);
    }

    public boolean take(String product) {
        if (this.storage.containsKey(product)) {
            int stock = this.storage.get(product);

            if (stock > 0) {
                this.storage.put(product, stock - 1);
                return true;
            }           
        }

        return false;
    }

    public int price(String product) {
        if (this.itemPrices.containsKey(product)) {
            return this.itemPrices.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (this.storage.containsKey(product)) {
            return this.storage.get(product);
        }
        
        return 0;
    }

    public Set<String> products() {
        return this.storage.keySet();
    }

}
