
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList       

        ArrayList<String> words = new ArrayList<String>();
        String text = "A";
        
        while (!text.isEmpty()) {
            System.out.print("Type a word: ");
            text = reader.nextLine();
            words.add(text);
        }
            Collections.reverse(words);
                System.out.println("You typed a following words: ");
                for (String i : words) {
                    System.out.println(i);
        }
    }
}
