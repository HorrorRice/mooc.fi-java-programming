
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers:");
        while (true) {
            int input = reader.nextInt();
            if (input == -1) {
                break;
            } else {
                all.addNumber(input);
            }

            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
        }

        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }

}
