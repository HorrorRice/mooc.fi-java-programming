
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Ignore {

    public static boolean Case(String toModify, String modifier) {
        if (toModify.toLowerCase().contains(modifier.trim().toLowerCase())) {
            return true;
        }
        return false;
    }

}
