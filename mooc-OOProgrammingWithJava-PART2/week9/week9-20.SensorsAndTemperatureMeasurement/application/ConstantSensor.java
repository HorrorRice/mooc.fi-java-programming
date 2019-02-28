/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Rifqi
 */
public class ConstantSensor implements Sensor {
    
    private int n;
    
    public ConstantSensor(int number){
        this.n = number;
    }

    @Override
    public boolean isOn() {
        boolean isOn = true;
        
       if(isOn){
           return true;
       } else {
           return false;
       }
    }

    @Override
    public void on() {
 
    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.n;
    }
    
}
