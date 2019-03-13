
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private Scanner reader;

    private void openFile(String file) throws FileNotFoundException {

        this.reader = new Scanner(new File(file));
    }

    private void closeFile() {

        this.reader.close();
    }

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> text = new ArrayList<String>();

        openFile(file);

        while (this.reader.hasNextLine()) {
            text.add(this.reader.nextLine());

        }

        closeFile();

        return text;
    }

    public void save(String file, String text) throws IOException {

        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();

    }

    public void save(String file, List<String> texts) throws IOException {

        FileWriter writer = new FileWriter(file);
        for (String e : texts) {
            writer.write(e + "\n");
        }
        writer.close();

    }
}
