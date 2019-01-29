
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        // create here the ArrayList 
        
        while (true) {
            System.out.print("Type a word: ");
            String text = reader.nextLine();
            if (words.contains(text)) {
                System.out.println("You gave the word " + text + " twice");
                break;
            }else { 
                words.add(text);
            }
            
            
        }

    }
}
