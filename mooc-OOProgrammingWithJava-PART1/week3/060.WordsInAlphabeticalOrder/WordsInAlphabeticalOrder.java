
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String text = reader.nextLine();
            if (!text.isEmpty()) {
                words.add(text);
                Collections.sort(words);
            } else {
                System.out.println("You typed a following words: ");
                for (String i : words) {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
