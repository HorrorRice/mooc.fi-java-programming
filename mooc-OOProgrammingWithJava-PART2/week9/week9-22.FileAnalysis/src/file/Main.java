package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/testfile.txt");
        Analysis f = new Analysis(file);
        
        System.out.println("Lines: " + f.lines());
        System.out.println("Characters: " + f.characters());
        f.printAll();
    }
}
