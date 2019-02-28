/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch;

import PhoneSearch.Interface.TextUserInterface;
import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class UserInterface implements TextUserInterface {

    private Phonebook phonebook;
    private Scanner reader;

    public UserInterface() {

        this.phonebook = new Phonebook();
        this.reader = new Scanner(System.in);

    }

    @Override
    public void start() {

        printCmd();

        while (true) {

            System.out.print("command: ");
            String input = reader.nextLine();

            if (input.equals("1")) {
                addNumber();
            } else if (input.equals("2")) {
                searchByName();
            } else if (input.equals("3")) {
                searchByNumber();
            } else if (input.equals("4")) {
                addAddress();
            } else if (input.equals("5")) {
                searchPersonalInfo();
            } else if (input.equals("6")) {
                removePersonalInfo();
            } else if (input.equals("7")) {
                filteredSearch();
            } else if(input.equals("x")) {
                break;
            }

        }
    }

    @Override
    public void addNumber() {

        System.out.print("whose number: ");
        String name = this.reader.nextLine();

        System.out.print("number ");
        String number = this.reader.nextLine();

        phonebook.addNumber(name, number);
        lineBreak();

    }

    @Override
    public void searchByName() {

        System.out.print("whose number: ");
        String person = reader.nextLine();

        phonebook.getNumber(person);
        lineBreak();

    }

    @Override
    public void searchByNumber() {

        System.out.print("number: ");
        String number = reader.nextLine();

        phonebook.getName(number);
        lineBreak();

    }

    @Override
    public void addAddress() {

        System.out.print("whose address: ");
        String person = reader.nextLine();

        System.out.print("street: ");
        String street = reader.nextLine();

        System.out.print("city: ");
        String city = reader.nextLine();

        phonebook.addAddress(person, street, city);
        lineBreak();

    }

    @Override
    public void searchPersonalInfo() {

        System.out.print("whose information: ");
        String person = reader.nextLine();

        phonebook.getInfo(person);
        lineBreak();

    }

    @Override
    public void removePersonalInfo() {

        System.out.print("whose information: ");
        String person = reader.nextLine();

        phonebook.removeInfo(person);
        lineBreak();

    }

    @Override
    public void filteredSearch() {
        System.out.print("keyword (if empty, all listed): ");
        String input = reader.nextLine();
        
        phonebook.filteredSearch(input);
    }

    @Override
    public void lineBreak() {
        System.out.println();
    }

    @Override
    public void printCmd() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

}
