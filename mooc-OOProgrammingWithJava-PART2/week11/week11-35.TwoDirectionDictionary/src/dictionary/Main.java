package dictionary;

public class Main {

    public static void main(String[] args) {

        MindfulDictionary dict = new MindfulDictionary("src/words.txt");

        dict.load();

        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("ohjelmointi", "programming");
        dict.add("yes", "ya");
        
        dict.save();

// using the dictionary
    }
}
