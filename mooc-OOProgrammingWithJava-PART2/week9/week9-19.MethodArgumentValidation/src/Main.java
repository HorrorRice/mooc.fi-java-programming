/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
import validation.Person;
import validation.Calculator;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Rifqi", 17);
        Calculator calc = new Calculator();

        System.out.println(calc.multiplication(0));
        System.out.println(calc.binomialCoefficient(60, -5));

        System.out.println(person);

    }

}
