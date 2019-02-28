/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch.Interface;

/**
 *
 * @author Rifqi
 */
public interface PhonebookInterface {
    
    void addNumber(String person, String number);
    void getNumber(String person);
    void getName(String number);
    void addAddress(String person, String street, String city);
    void getInfo(String person);
    void removeInfo(String person);
    void filteredSearch(String keyword);

    
}
