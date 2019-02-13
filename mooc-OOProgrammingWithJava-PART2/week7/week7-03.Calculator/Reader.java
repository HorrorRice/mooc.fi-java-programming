
import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class Reader {

    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }

    public String readString() {
        String input = reader.nextLine();
        return input;
    }

    public int readInteger() {
        int input = Integer.parseInt(reader.nextLine());
        return input;
    }
}
