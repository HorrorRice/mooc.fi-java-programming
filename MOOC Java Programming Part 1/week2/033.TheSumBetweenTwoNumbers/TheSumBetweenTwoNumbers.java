
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
//     Use a helper variable in your program to remember how many times the block has been executed.
//     Use also another helper variable to store the sum.
//     During each execution add the value of the helper variable that counts the executions
//     to the variable in which you should collect the sum.
        
        int sum = 0;
        System.out.print("First: ");
        int a = reader.nextInt();

        System.out.print("Last: ");
        int b = reader.nextInt();

        while (a <= b) {
            sum += a;
            a++;
        }

        System.out.println("Sum is " + sum);
    }
}
