
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you? ");
            int age = Integer.parseInt(reader.nextLine());
            boolean isImpossible = age <  0 || age > 120;
		if(isImpossible) {
                    System.out.println("Impossible!");
		} else {
                    System.out.println("Ok");
		}

    }
}
