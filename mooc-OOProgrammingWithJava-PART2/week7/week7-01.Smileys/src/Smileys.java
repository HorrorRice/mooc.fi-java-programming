
public class Smileys {

    public static void main(String[] args) {

        printWithSmileys("\\:D/");

    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        boolean odd = length % 2 != 0;

        printLine(length, odd);
        mainFrame(length, odd, characterString);
        printLine(length, odd);
    }

    private static void printOne() {
        System.out.print(":)");
    }

    private static void lineBreak() {
        System.out.println();
    }

    private static void whiteSpace() {
        System.out.print(" ");
    }

    private static void printContent(String string) {
        System.out.print(string);
    }

    private static int frame(int length, boolean odd) {
        if (odd) {
            length += 1;
        }
        return (length / 2) + 1; // 2 is length of smiley

    }

    private static void mainFrame(int length, boolean odd, String characterString) {
        printOne();
        whiteSpace();
        printContent(characterString);
        if (odd) {
            whiteSpace();
        }
        whiteSpace();
        printOne();
        lineBreak();
    }

    private static void printLine(int length, boolean odd) {
        int frameLength = frame(length, odd) + 2; // 2 is length of smiley

        for (int i = 0; i < frameLength; i++) {
            printOne();
        }

        lineBreak();

    }

}
