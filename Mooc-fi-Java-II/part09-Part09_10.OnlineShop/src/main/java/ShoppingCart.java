
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> itemsInCart;
    
    public ShoppingCart() {
        this.itemsInCart = new HashMap<>();
    }
    
    public void add(String product, int price) {
       if (this.itemsInCart.containsKey(product)) {
            this.itemsInCart.get(product).increaseQuantity();
       } else {
            this.itemsInCart.put(product, new Item(product, 1, price));
       }
    }
    
    public int price() {
        int totalPrice = 0;
        for(Item item : this.itemsInCart.values()) { 
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item item : this.itemsInCart.values()) {
            System.out.println(item);
        }
    }
}
