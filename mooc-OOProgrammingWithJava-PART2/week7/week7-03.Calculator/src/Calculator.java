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
    private int value1;
    private int value2;

    public Calculator() {
        input = new Reader();
        this.calculatorLog = 0;
    }

    public void start() {
        System.out.println("|----- Command Line Calculator -----|");
        System.out.println("type: 'help' to see all available commands.");
        while (true) {
            System.out.print("command: ");
            String command = input.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum") || command.equals("+")) {
                sum();
            } else if (command.equals("multiply") || command.equals("*")) {
                multiply();
            } else if (command.equals("substract") || command.equals("-")) {
                substract();
            } else if (command.equals("divide") || command.equals("/")) {
                divide();
            } else if (command.equals("mod") || command.equals("%")) {
                modulus();
            } else if (command.equals("help") || command.equals("?")) {
                help();
            } else if (command.equals("log")) {
                statistics();
            }
        }
        statistics();

    }

    public void inputValue() {
        System.out.print("value1: ");
        this.value1 = this.input.readInteger();
        System.out.print("value2: ");
        this.value2 = this.input.readInteger();
    }

    public void sum() {
        inputValue();

        int total = this.value1 + this.value2;
        System.out.println("sum of the values " + total);
        calculatorLog++;
    }

    public void multiply() {
        inputValue();

        int total = this.value1 * this.value2;
        System.out.println("multiplication of the values: " + total);
        calculatorLog++;
    }

    public void substract() {
        inputValue();

        int total = this.value1 - this.value2;
        System.out.println("substraction of the values: " + total);
        calculatorLog++;
    }

    public void divide() {
        inputValue();

        int total = this.value1 / this.value2;
        System.out.println("division of the values: " + total);
        calculatorLog++;
    }

    public void modulus() {
        inputValue();

        int total = this.value1 % this.value2;
        System.out.println("modulus of the values: " + total);
        calculatorLog++;
    }

    public void help() {
        System.out.println("List Command :\n'+' 'sum' - addition\n"
                + "'*' 'multiply' - multiplication\n"
                + "'-' 'substract' - substraction\n"
                + "'/' 'divide' - division\n"
                + "'?' 'help' - show list of commands\n"
                + "'log' - show log\n"
                + "'end' - quit calculator");
    }

    public void statistics() {
        System.out.println("Calculations done " + calculatorLog);
    }
}
