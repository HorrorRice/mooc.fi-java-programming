
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Dictionary {

    private HashMap<String, String> translator;
//   private int amountOfWords;

    public Dictionary() {
        this.translator = new HashMap<String, String>();
//        this.amountOfWords = 0;
    }

    public String translate(String string) {
        return this.translator.get(string);
    }

    public void add(String word, String translation) {
        this.translator.put(word, translation);
//        this.amountOfWords++;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String each : this.translator.keySet()) {
            String eachValue = this.translator.get(each);

            String toString = each + " = " + eachValue;
            translationList.add(toString);
        }

        return translationList;
    }

    public int amountOfWords() {
//        return this.amountOfWords;

//        int amountOfWords = 0;
//        for (String each : this.translator.keySet()) {
//            amountOfWords++;
//        }
//        return amountOfWords;

        return this.translator.size();
    }
}
