
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
            String input = reader.nextLine();
        System.out.println("Number of character: " + calculateCharacters(input));
    }
    
    // do here the method
    
    public static int calculateCharacters(String text) {
        return text.length();
    }
    
}
