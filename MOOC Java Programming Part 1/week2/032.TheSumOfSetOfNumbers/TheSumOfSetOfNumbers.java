
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//      Use a helper variable in your program to remember how many times the block has been executed.
//      Use also another helper variable to store the sum.
//      During each execution add the value of the helper variable that counts the executions
//      to the variable in which you should collect the sum.
        
        System.out.print("Until what? ");
        int num = reader.nextInt();

        int sum = 0;
        int i = 0;
        while (num > i) {
            i++;
            sum += i;
            
        }

        System.out.println("Sum is " + sum);

    }
}
