/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file) {

        this.file = file;

    }

    public void openFile() throws FileNotFoundException {

        this.reader = new Scanner(file, "UTF-8");

    }

    public void closeFile() throws FileNotFoundException {

        this.reader.close();

    }

    public int wordCount() throws FileNotFoundException {

        int wordCount = 0;

        openFile();

        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();
            wordCount++;
        }

        closeFile();
        return wordCount;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {

        List<String> shortList = new ArrayList<String>();

        openFile();

        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();

            if (buffer.contains("z") || buffer.contains("Z")) {
                shortList.add(buffer);
            }

        }

        closeFile();
        return shortList;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {

        List<String> shortList = new ArrayList<String>();

        openFile();

        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();

            if (buffer.endsWith("l") || buffer.endsWith("L")) {
                shortList.add(buffer);
            }

        }

        closeFile();
        return shortList;
    }

    public List<String> palindromes() throws FileNotFoundException {

        List<String> shortList = new ArrayList<String>();

        openFile();

        String reversed = "";
        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();

            for (int i = buffer.length() - 1; i >= 0; i--) {

                reversed += buffer.charAt(i);
            }

            if (buffer.equals(reversed)) {

                shortList.add(buffer);

            }

            reversed = "";

        }

        closeFile();
        return shortList;

    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {

        List<String> shortList = new ArrayList<String>();

        openFile();

        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();

            if (buffer.contains("a") && buffer.contains("i") && buffer.contains("u") && buffer.contains("e") && buffer.contains("o") && buffer.contains("y") && buffer.contains("ä") && buffer.contains("ö")) {

                shortList.add(buffer);

            }
        }

        closeFile();
        return shortList;

    }

}
