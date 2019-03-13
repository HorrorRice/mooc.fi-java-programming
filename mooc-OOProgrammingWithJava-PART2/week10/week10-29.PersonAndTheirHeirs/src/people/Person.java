/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Rifqi
 */
public class Person {
    
    private String name, address;
    
    public Person(String name, String address){
        
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        
        return name + "\n  " + address;
    }
    
}
