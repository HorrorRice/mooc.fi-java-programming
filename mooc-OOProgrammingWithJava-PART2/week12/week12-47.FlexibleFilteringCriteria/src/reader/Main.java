package reader;

import reader.criteria.*;

public class Main {

    public static void main(String[] args) {

//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
        String address = "https://horrorrice.github.io/assets/gutenberg.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion words = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        Criterion rightLength = new Both(
                new LengthAtLeast(20),
                new Not(new LengthAtLeast(31))
        );

        Criterion wanted = new Both(words, rightLength);

        for (String line : book.linesWhichComplyWith(words)) {
            System.out.println(line);
        }
    }
}
