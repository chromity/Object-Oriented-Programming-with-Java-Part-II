
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Purchase purchase : this.basket.values()) {
            totalPrice += purchase.price();
        }

        return totalPrice;
    }
    
    public void print() {
        for (Purchase purchase : this.basket.values()) {
            System.out.println(purchase);
        }
    }
}
