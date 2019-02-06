
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read,
                sum = 1, //result/sum must be = 1. becuase multiplication.
                n = 1; //0! = 1.

        System.out.print("Type a number: ");
        read = reader.nextInt();
        while (n <= read) {
            sum *= n;
            n++;
        }
        System.out.println("Factorial is " + sum);

    }
}
