/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Rifqi
 */
public class Cow implements Milkable, Alive {

    private final String name;
    private  double udderCap;
    private  double amountOfMilk;
    private final Random r = new Random();

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {

        this.name = NAMES[r.nextInt(NAMES.length)];
        this.udderCap = r.nextInt(40 - 15) + 15;
        this.amountOfMilk = 0;

    }

    public Cow(String name) {

        this.name = name;
        this.udderCap = r.nextInt(40 - 15) + 15;
        this.amountOfMilk = 0;
    }

    public String getName() {

        return this.name;
    }

    public double getCapacity() {

        return udderCap;
    }

    public double getAmount() {

        return amountOfMilk;
    }

    @Override
    public String toString() {

        return name + " " + Math.ceil(amountOfMilk) + "/" + Math.ceil(udderCap);
    }

    @Override
    public double milk() {

        double temp = amountOfMilk;
        amountOfMilk = 0;
        return temp;
    }

    @Override
    public void liveHour() {

        double milkProduced = 0.7 + (2 - 0.7) * r.nextDouble();

        if (amountOfMilk + milkProduced <= udderCap) {
            amountOfMilk += udderCap;
        }
        amountOfMilk = udderCap;
    }

}
