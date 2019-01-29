
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = 0,
            sum = 0,
            num;
        
        System.out.print("Type a number: ");
            num = reader.nextInt();
            
            while (num >= n) {
                sum += (int)Math.pow(2,n);
                n++;
              
            }
            System.out.println("The result is " + sum);
    }
}
