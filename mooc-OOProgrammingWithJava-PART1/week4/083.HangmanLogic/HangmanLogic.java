
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!guessedLetters.contains(letter)) {
            if (this.word.contains(letter)) {
                this.guessedLetters += letter;
            } else {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            char cL = word.charAt(i);
            String sL = "" + cL;

            if (guessedLetters.contains(sL)) {
                hiddenWord += cL;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;

    }
}
