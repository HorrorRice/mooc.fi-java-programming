
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> box;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        box = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0; // buffer
        for (ToBeStored each : this.box) {
            weight += each.weight();
        }
        return weight;
    }

    public void add(ToBeStored item) {
        if (item.weight() + weight() <= this.maxWeight) { // if the item weight + box weight is not reached the maximum of the box weight, 
            this.box.add(item); // add item to box.
        }
    }
    
    public String toString(){
        return "Box: " +  box.size() + " things, total weight " + weight() + " kg";
    }
}
