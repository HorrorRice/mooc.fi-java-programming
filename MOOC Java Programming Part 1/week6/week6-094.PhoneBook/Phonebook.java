
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Phonebook {
    private ArrayList<Person> contactList;

    public Phonebook() {
        contactList = new ArrayList<Person>();

    }

    public void add(String name, String number) {
        contactList.add(new Person(name, number));

    }

    public String searchNumber(String name) {
        for (Person exist : contactList) {
            if (exist.getName().contains(name)) {
                return exist.getNumber();
            }

        }
        return "number not known";
    }

    public void printAll() {
        for (Person each : contactList) {
            System.out.println(each);
        }
    }

}
