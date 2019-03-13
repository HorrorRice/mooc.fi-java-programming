/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import PhoneSearch.Interface.PhonebookInterface;
import java.util.TreeMap;

/**
 *
 * @author Rifqi
 */
public class Phonebook implements PhonebookInterface {

    private Map<String, Set<String>> phonebook;
    private Map<String, Address> address;

    public Phonebook() {

        this.phonebook = new HashMap<String, Set<String>>();
        this.address = new HashMap<String, Address>();

    }

    @Override
    public void addNumber(String person, String number) {

        if (!this.phonebook.containsKey(person)) {
            this.phonebook.put(person, new HashSet<String>());

        }

        this.phonebook.get(person).add(number);

    }

    @Override
    public void getName(String number) {

        for (String person : this.phonebook.keySet()) {
            if (this.phonebook.get(person).contains(number)) {
                System.out.println(" " + person);
                return;

            }

        }
        System.out.println(" not found");

    }

    @Override
    public void getNumber(String person) {

        try {
            for (String n : this.phonebook.get(person)) {
                if (this.phonebook.get(person).size() > 1) {
                    System.out.println(" " + n);
                } else {
                    System.out.println("number: " + n);
                }
            }
        } catch (Exception e) {
            System.out.println("  not found");
        }

    }

    @Override
    public void addAddress(String person, String street, String city) {

        this.address.put(person, new Address(street, city));

    }

    @Override
    public void getInfo(String person) {

        if (!this.address.containsKey(person) && !this.phonebook.containsKey(person)) {
            System.out.println("  not found");

        } else {

            if (this.address.containsKey(person)) {
                System.out.println("  address: " + this.address.get(person));

            } else {
                System.out.println("  address unknown");
            }

            if (this.phonebook.containsKey(person)) {
                System.out.println("  phone numbers:");

                for (String n : this.phonebook.get(person)) {
                    System.out.println("   " + n);
                }

            } else {
                System.out.println("  phone number not found");
            }
        }

    }

    @Override
    public void removeInfo(String person) {

        if (this.address.containsKey(person) || this.phonebook.containsKey(person)) {

            this.address.remove(person);
            this.phonebook.remove(person);

        } else {
            System.out.println(" not found");
        }
    }

    @Override
    public void filteredSearch(String keyword) {
        TreeMap<String, Set<String>> sorted = new TreeMap<String, Set<String>>(this.phonebook);
        boolean found = false;

        for (String person : sorted.keySet()) {
            if (person.contains(keyword) || (this.address.containsKey(person) && this.address.get(person).searchAddress(keyword))) {
                System.out.println("\n " + person);
                getInfo(person);
                found = true;
            }

        }

        if (found == false) {
            System.out.println(" keyword not found");
        }

    }
}
