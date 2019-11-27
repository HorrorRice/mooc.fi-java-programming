/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String InitialName, int initialAge){
        this.name = InitialName;
        this.age = initialAge;
    }
     
    public void printPerson(){
        System.out.println(this.name);
    }
    
    public void becomeOlder() {
        this.age++;    // same as this.age = this.age + 1;
        System.out.println(this.age);
    }
   
    
}
