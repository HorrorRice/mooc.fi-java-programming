
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Storehouse {

    private Map<String, Integer> market;
    private Map<String, Integer> storage;

    public Storehouse() {
        this.market = new HashMap<String, Integer>();
        this.storage = new HashMap<String, Integer>();
    }
    
    public Set<String> products(){
        Set products = new HashSet<String>();
        for(String key : market.keySet()){
           products.add(key);
        }
        return products;
    }

    public void addProduct(String product, int price, int stock) {
        market.put(product, price);
        storage.put(product, stock);
    }

    public boolean take(String product) {
        int stock = 0;
        if (storage.containsKey(product)) {
            stock = storage.get(product);
            if (stock > 0) {
                stock--;
                storage.replace(product, stock);
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public int price(String product) {
        if (market.containsKey(product)) {
            return market.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (storage.containsKey(product)) {
            return storage.get(product);
        }
        return 0;
    }
}
