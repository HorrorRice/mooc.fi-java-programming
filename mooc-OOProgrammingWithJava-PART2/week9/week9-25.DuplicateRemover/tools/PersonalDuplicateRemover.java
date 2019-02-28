/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rifqi
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> words;
    private int countDups = 0;

    public PersonalDuplicateRemover() {
        this.words = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (words.contains(characterString)) {
            countDups++;
        }
        words.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {

        return countDups;

    }

    @Override
    public Set<String> getUniqueCharacterStrings() {

        return words;
    }

    @Override
    public void empty() {

        words.clear();
        countDups = 0;

    }

}
