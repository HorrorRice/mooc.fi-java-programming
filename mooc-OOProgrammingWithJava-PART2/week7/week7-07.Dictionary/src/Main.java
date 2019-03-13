
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "translate\n" + "monkey\n"
                + "translate\n" + "cheese\n"
                + "add\n" + "cheese\n" + "juusto\n"
                + "translate\n" + "cheese\n"
                + "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();

    }
}
