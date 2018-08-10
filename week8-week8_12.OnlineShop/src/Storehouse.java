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
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> store = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.store.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.store.containsKey(product)) {
            return this.store.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
}
    public Set<String> products() {
        return store.keySet();
    }
}
