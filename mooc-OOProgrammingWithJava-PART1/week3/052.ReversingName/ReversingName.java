import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        System.out.print("In reverse order: ");
        
        int i = input.length() - 1;
        while (i >= 0) {
            System.out.print(input.charAt(i));
            i--;  
        }
        System.out.println("");
    }
}
