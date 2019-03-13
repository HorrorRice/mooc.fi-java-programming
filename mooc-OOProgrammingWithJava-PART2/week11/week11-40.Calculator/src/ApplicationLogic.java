/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
public class ApplicationLogic {

     private int result;
 
    public void plus(int value) {
        result += value;
    }

    public void minus(int value) {
        result -= value;
    }

 
    public void clear() {
        result = 0;
    }

    public int result() {
        return result;
    }

}