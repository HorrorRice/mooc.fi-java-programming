
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class ShoppingBasket {

   private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            Purchase newPurchase = new Purchase(product, 1, price);
            basket.put(product, newPurchase);
        }

    }

    public int price() {
        int price = 0;
        for (Purchase each : basket.values()) {
            price += each.price();
        }
        return price;
    }

    public void print() {
        for(Purchase each : basket.values()){
            System.out.println(each);
        }
    }
}
