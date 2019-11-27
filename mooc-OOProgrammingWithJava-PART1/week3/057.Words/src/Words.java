
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
    
        while (true) {
            System.out.print("Type a word: ");
            String text = reader.nextLine();
            if (!text.isEmpty()) {
                words.add(text);
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
