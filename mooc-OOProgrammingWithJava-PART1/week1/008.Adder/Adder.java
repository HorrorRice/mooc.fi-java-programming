
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int anotherNumber;
    

        // Implement your program here. Remember to ask the input from user
            System.out.print("Enter a number: ");
	        number = Integer.parseInt(reader.nextLine());
	    System.out.print("Enter another number: ");
	        anotherNumber = Integer.parseInt(reader.nextLine());
                int result = number + anotherNumber;
	    System.out.print("Sum of the numbers: " + (result));
    }
}
