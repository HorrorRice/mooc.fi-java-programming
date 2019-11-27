
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int command;

        int count = 0;

        while (true) {
            System.out.print("Guess a number: ");
            command = reader.nextInt();
            count++;
            if (command == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (command < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + count);

            } else {
                System.out.println("The number is lesser, guesses made: " + count);

            }

        }

    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
