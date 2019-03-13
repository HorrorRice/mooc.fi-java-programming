
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
public class Suitcase {

    private ArrayList<Thing> suitcase;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (maxWeight - totalWeight() >= thing.getWeight()) {
            this.suitcase.add(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing each : this.suitcase) {
            weight += each.getWeight();
        }

        return weight;
    }

    public String toString() {
//        if (this.suitcase.size() > 1) {
//            return (this.suitcase.size() + " things " + "(" + this.totalWeight() + " kg)");
//        } else if (suitcase.size() == 1) {
//            return (this.suitcase.size() + " thing " + "(" + this.totalWeight() + " kg");
//        }
//        return ("empty " + "(" + this.totalWeight() + " kg)");

        switch (this.suitcase.size()) {
            case 0:
                return ("empty " + "(" + this.totalWeight() + " kg)");
            case 1:
                return (this.suitcase.size() + " thing " + "(" + this.totalWeight() + " kg)");
            default:
                return (this.suitcase.size() + " things " + "(" + this.totalWeight() + " kg)");

        }

    }

    public void printThings() {
        for (Thing each : this.suitcase) {
            System.out.println(each);
        }
    }

    public Thing heaviestThing() {

//        if (suitcase.isEmpty()) {
//            return null;
//        }
        Thing heaviest = null;

        for (Thing each : this.suitcase) {
            if (heaviest == null || each.getWeight() > heaviest.getWeight()) {
                heaviest = each;
            }

        }

        return heaviest;
    }

}
