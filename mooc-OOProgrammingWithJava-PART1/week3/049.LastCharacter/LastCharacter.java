import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
            String input = reader.nextLine();
            System.out.println("First character is " + lastCharacter(input));
    }
    public static char lastCharacter(String text) {  
        return text.charAt(text.length() - 1);
    }
}
