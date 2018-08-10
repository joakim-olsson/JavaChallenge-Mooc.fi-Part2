/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> shoppingBasket;

    public ShoppingBasket() {
        this.shoppingBasket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (this.shoppingBasket.containsKey(product)) {
            this.shoppingBasket.get(product).increaseAmount();
        } else {
            this.shoppingBasket.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int helper = 0;
        for (Purchase i : this.shoppingBasket.values()) {
            helper += i.price();
        }
        return helper;
    }
    
    public void print() {
        for (Purchase i : this.shoppingBasket.values()) {
            System.out.println(i);
        }
    }

}
