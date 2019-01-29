
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        
        System.out.print("Type your name: ");	
            String name = reader.nextLine();
	System.out.print("Type your age: ");	
            int age = Integer.parseInt(reader.nextLine());
            
	System.out.print("\nType your name: ");	
            String anotherName = reader.nextLine();
	System.out.print("Type your age: ");
            int anotherAge = Integer.parseInt(reader.nextLine());
			
	System.out.println(name + " and " + anotherName + " are " + (age + anotherAge) + " years old in total.");	
    }
}
