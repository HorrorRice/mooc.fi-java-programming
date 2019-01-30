/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
public class BoundedCounter {

    private int value;
    private int upperlimit;

    public BoundedCounter(int upperlimit) {
        this.upperlimit = upperlimit;
    }

    public void next() {

        if (value < upperlimit) {
            value += 1;
        } else if (value == upperlimit) {
            value = 0;
        }

    }

    public String toString() {
        String prefix = "";
        if (value < 10) {
            prefix = "0";
        }
        return prefix + value;
    }

    public int getValue() {
        return value;

    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperlimit) {
            value = newValue;
        }

    }

}
