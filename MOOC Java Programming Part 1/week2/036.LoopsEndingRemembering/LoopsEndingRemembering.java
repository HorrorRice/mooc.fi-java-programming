
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int num,
                sum = 0,
                count = 0,
                isEven = 0,
                isOdd = 0;

        System.out.println("Type numbers: ");
        while (true) {

            num = Integer.parseInt(reader.nextLine());
            if (num < 0) {
                break;
            }
            sum += num;
            count++;
            if (num % 2 == 0) {
                isEven++;
            } else {
                isOdd++;
            }

        }
        double average = (double) sum / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers:  " + count);
        System.out.println("Average:  " + average);
        System.out.println("Evennumbers:  " + isEven);
        System.out.println("Odd numbers:  " + isOdd);

    }
}
