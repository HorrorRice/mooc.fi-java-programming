/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Rifqi
 */
public class Thermometer implements Sensor {

    private Random rand;
    private boolean state;

    public Thermometer() {

        this.rand = new Random();
        this.state = false; // state is off by default
    }

    @Override
    public boolean isOn() {
        return this.state; // check if state is on or off
    }

    @Override
    public void on() {
       this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(!state){ // if state is off
            throw new IllegalArgumentException("Set Thermometer state to on before measuring it!.");
        }
        return rand.nextInt(30 - -30) + -30; // random number between -30 to 30
        
    }

}
