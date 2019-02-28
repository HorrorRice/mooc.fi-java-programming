/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rifqi
 */
public class Box implements Thing {

    private List<Thing> box;
    private int maximumCapacity;

    public Box(int maximumCapacity) {

        this.box = new ArrayList<Thing>();
        this.maximumCapacity = maximumCapacity;

    }

    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maximumCapacity) {
            box.add(thing);
            return true;
        }

        return false;

    }

    @Override
    public int getVolume() {

        int buffer = 0;
        for (Thing e : box) {
            buffer += e.getVolume();
        }

        return buffer;
    }

    public String toString() {

        return "  things in the box: " + getVolume() + " dm^3";

    }

}
