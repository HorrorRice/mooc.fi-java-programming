
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
            String text = reader.nextLine();
            
        System.out.print("Length of the first part: ");
            int num = reader.nextInt();
            
        System.out.println("Result: " + text.substring(0, num));   
    }
}
