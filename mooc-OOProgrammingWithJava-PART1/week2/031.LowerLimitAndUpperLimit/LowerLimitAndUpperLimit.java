
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int a;
        int b;


        System.out.print("First: ");
        a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        b = Integer.parseInt(reader.nextLine());

        while (a <= b) {
            System.out.println(a);
            a++;
        }

    }
}
