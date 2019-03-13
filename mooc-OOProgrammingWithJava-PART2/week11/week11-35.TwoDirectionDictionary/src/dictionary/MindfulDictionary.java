/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rifqi
 */
public class MindfulDictionary {

    private String file;
    private Map<String, String> dictionary = new HashMap<String, String>();

    public MindfulDictionary() {

    }

    public MindfulDictionary(String file) {

        this.file = file;
    }

    public boolean load() {

        try {
            File f = new File(file);
            Scanner r = new Scanner(f);

            while (r.hasNextLine()) {
                String string = r.nextLine();
                String[] parts = string.split(":");
                dictionary.put(parts[0], parts[1]);

            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean save() {

        try {
            FileWriter writer = new FileWriter(file);

            for (String key : dictionary.keySet()) {
                writer.write(key + ":" + dictionary.get(key) + "\n");
            }
            writer.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {

        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }

    }

    public String translate(String word) {

        if (dictionary.containsKey(word)) {
            return dictionary.get(word);

        } else if (dictionary.containsValue(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void remove(String word) {
        List<String> bin = new ArrayList<String>();

        if (dictionary.containsKey(word)) {
            dictionary.remove(word);

        } else if (dictionary.containsValue(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    bin.add(key);
                }
            }

            for (String words : bin) {
                dictionary.remove(words);
            }
        }

    }

}
