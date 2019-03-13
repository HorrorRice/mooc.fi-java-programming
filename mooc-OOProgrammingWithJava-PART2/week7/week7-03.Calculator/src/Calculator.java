/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Calculator {

    private Reader input;
    private int calculatorLog;

    public Calculator() {
        input = new Reader();
        this.calculatorLog = 0;
    }

    public void start() {

        while (true) {
            System.out.print("command: ");
            String command = input.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("product")) {
                product();
            } else if (command.equals("difference")) {
                difference();
            }
        }
        statistics();

    }

    private void sum() {
        calculatorLog++;

        System.out.print("Value1: ");
        int value1 = this.input.readInteger();
        System.out.print("Value2: ");
        int value2 = this.input.readInteger();

        int total = value1 + value2;
        System.out.println("sum of the values " + total);
    }

    private void product() {
        calculatorLog++;

        System.out.print("value1: ");
        int value1 = input.readInteger();
        System.out.print("value2: ");
        int value2 = input.readInteger();

        int total = value1 * value2;
        System.out.println("product of the values: " + total);
    }

    private void difference() {
        calculatorLog++;

        System.out.print("value1: ");
        int value1 = input.readInteger();
        System.out.print("value2: ");
        int value2 = input.readInteger();

        int total = value1 - value2;
        System.out.println("difference of the values: " + total);
    }

    private void statistics() {
        System.out.println("Calculations done " + calculatorLog);
    }
}
