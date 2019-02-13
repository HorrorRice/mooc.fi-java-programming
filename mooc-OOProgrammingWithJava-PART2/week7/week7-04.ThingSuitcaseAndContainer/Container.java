
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
public class Container {

    private ArrayList<Suitcase> container;
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= this.maxWeight) {
            this.container.add(suitcase);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase each : this.container) {
            weight += each.totalWeight();
        }

        return weight;
    }

    public void printThings() {
        for (Suitcase suitcases : this.container) {
            suitcases.printThings();
        }
    }

    public String toString() {
        switch (this.container.size()) {
            case 0:
                return ("empty " + "(" + this.totalWeight() + " kg)");
            case 1:
                return (this.container.size() + " suitcase " + "(" + this.totalWeight() + " kg)");
            default:
                return (this.container.size() + " suitcases " + "(" + this.totalWeight() + " kg)");

        }

    }

}
