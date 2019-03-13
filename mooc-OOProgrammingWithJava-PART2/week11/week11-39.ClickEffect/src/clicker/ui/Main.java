package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        
       SwingUtilities.invokeLater(new UserInterface(new PersonalCalculator()));
    }
}
