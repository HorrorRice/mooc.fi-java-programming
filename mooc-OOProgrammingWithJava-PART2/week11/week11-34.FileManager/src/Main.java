
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        t.save("src/testinput1.txt", "first\nsecond\nthird");

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }

}
