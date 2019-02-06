
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int command;

        // program your solution here. Do not touch the above lines!  
//        int i = 1;
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
//                i += count;
//                count++;
            } else {
                System.out.println("The number is lesser, guesses made: " + count);
//                i += count;
//                count++;
            }

        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
