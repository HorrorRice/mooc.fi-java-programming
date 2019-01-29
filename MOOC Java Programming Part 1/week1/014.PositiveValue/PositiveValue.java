
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        
        System.out.print("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());
            boolean isLess = number <= 0;
		if(isLess) {
                    System.out.println("The number is not positive.");		
		} else {
                    System.out.println("The number is positive.");
		}
			
    }
}
