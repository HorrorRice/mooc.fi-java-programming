
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int anotherNumber;

        // Implement your program here. Remember to ask the input from user
            System.out.print("Enter a number: ");
	        number = Integer.parseInt(reader.nextLine());
	    System.out.print("Enter another number: ");
	        anotherNumber = Integer.parseInt(reader.nextLine());
                double result;
                result = (double)number / anotherNumber;
	    System.out.print(result + "Division: "+ number + " / " + anotherNumber + " = " + (result));
    }
}
