
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Shop {

    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;

    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop" + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("what do you want to buy (press enter to pay");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            } else if (store.stock(product) > 0) {
                store.take(product);
                basket.add(product, store.price(product));
            }
        }
        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());

    }

}
