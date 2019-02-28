/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rifqi
 */
public class AverageSensor implements Sensor {

    private List<Integer> readings;
    private List<Sensor> sensors;

    public AverageSensor() {

        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {

        boolean sensorsState = true;

        for (Sensor e : this.sensors) {
            if (e.isOn()) {
                sensorsState = true;
            } else {
                sensorsState = false;
            }
        }

        return sensorsState;
    }

    @Override
    public void on() {

        for (Sensor e : this.sensors) {
            e.on();
        }
    }

    @Override
    public void off() {

        for (Sensor e : this.sensors) {
            e.off();
        }
    }

    @Override
    public int measure() {

        if (isOn() == false) {
            throw new IllegalArgumentException("The Average Sensor state is currently off");
        }
        
        int total = 0;
        for (Sensor e : this.sensors) {
            total += e.measure();
        }

        int average = total / this.sensors.size();
        this.readings.add(average);

        return average;

    }

    public void addSensor(Sensor name) {

        this.sensors.add(name);
    }

    public List<Integer> readings() {

        return this.readings;
    }

}
