/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String initialName, double initialPrice, int initialAmount) {
        this.name = initialName;
        this.price = initialPrice;
        this.amount = initialAmount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
