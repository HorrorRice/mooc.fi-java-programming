
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.toLowerCase().contains(searched.trim().toLowerCase())){
            return true;
        }
        return false;
    }

}
