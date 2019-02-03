
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        BirdWatch birdDatabase = new BirdWatch();

        String input = "";
        while (!input.contains("Quit")) {

            System.out.print("? ");
            input = reader.nextLine();

            if (Ignore.Case("Add", input)) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                Bird bird = new Bird(name, latinName);
                birdDatabase.add(bird);

            } else if (Ignore.Case("Show", input)) {
                System.out.print("What? ");
                input = reader.nextLine();
                birdDatabase.show(input);

            } else if (Ignore.Case("Statistics", input)) {
                birdDatabase.statistics();

            } else if (Ignore.Case("Observation", input)) {
                System.out.print("What was observed ?: ");
                input = reader.nextLine();
                birdDatabase.observation(input);
            }

        }

    }
}
