
import java.util.HashMap;
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
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        help();
        while (true) {
            System.out.println();
            System.out.print("Statement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }

            if (command.equals("translate")) {
                translate();
            } else if (command.equals("add")) {
                add();
            } else {
                System.out.println("Unknown statement.");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();

        System.out.print("Translation: ");
        String translate = reader.nextLine();

        this.dictionary.add(word, translate);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        
       if (this.dictionary.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }

    public void help() {
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - ask a word and prints its translation");
        System.out.println("  help - show command list");
        System.out.println("  quit - quits the text user interface");
    }

}
