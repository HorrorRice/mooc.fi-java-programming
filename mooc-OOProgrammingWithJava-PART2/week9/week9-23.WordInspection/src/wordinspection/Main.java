package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection f = new WordInspection(file);
        
        System.out.println(f.wordCount());   
        
        System.out.println(f.wordsContainingZ());
        
        System.out.println(f.wordsEndingInL());
        
        System.out.println(f.palindromes());
        
        System.out.println(f.wordsWhichContainAllVowels());
        
        // [aakkosellisuus, aakkosnumeerinen, juustohöyläperiaate, valkokaulustyöläinen]
        
 
        
        // all words are in file src/wordList.txt

    }
   
}
