/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rifqi
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {

        this.dictionary = new HashMap<String, Set<String>>();

    }

    @Override
    public void add(String word, String entry) {
        // note that when when adding a new word, first to map an empty dictionary set to it
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }

        // first, we retrieve the set containing the dictionary's word and then we add an entry to it
        Set<String> finished = this.dictionary.get(word);
        finished.add(entry);
        
        // this method below will also work.
        // this.dictionary.get(word).add(entry);

    }

    @Override
    public Set<String> translate(String word) {
        
        return this.dictionary.get(word);
        
    }

    @Override
    public void remove(String word) {
        
        this.dictionary.remove(word);
        
    }

}
