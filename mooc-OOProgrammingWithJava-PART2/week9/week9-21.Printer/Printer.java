
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Printer {

    private File file;
    private Scanner reader;

    public Printer(String fileName) throws Exception {

        this.file = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {

        this.reader = new Scanner(file);

        String buffer = "";

        while (reader.hasNextLine()) {

            String line = reader.nextLine();

            if (line.contains(word)) {
                
                buffer += line;
                buffer += "\n";
                System.out.println(line);
                
            }

        }

        reader.close();

    }

    public void printAll() throws FileNotFoundException {

        this.reader = new Scanner(file);

        while (reader.hasNextLine()) {
            String buffer = reader.nextLine();

            System.out.println(buffer);
        }

        reader.close();
    }

}
