/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Rifqi
 */
public class BulkTank {

    private double capacity, volume;

    public BulkTank() {

        this.capacity = 2000.0;
        this.volume = 0;

    }

    public BulkTank(double capacity) {

        this.capacity = capacity;
        this.volume = 0;

    }

    public double getCapacity() {

        return capacity;
    }

    public double getVolume() {

        return volume;
    }

    public double howMuchFreeSpace() {

        return capacity - volume;
    }

    public void addToTank(double amount) {

        if (volume + amount <= howMuchFreeSpace()) {
            volume += amount;
            return;
        }
        volume = capacity;

    }

    public double getFromTank(double amount) {

        if (amount > volume) {
            return volume = 0.0;
        } else {
            return volume -= amount;
        }

    }

    @Override
    public String toString() {

        return Math.ceil(volume)+ "/" + Math.ceil(capacity);

    }
}
