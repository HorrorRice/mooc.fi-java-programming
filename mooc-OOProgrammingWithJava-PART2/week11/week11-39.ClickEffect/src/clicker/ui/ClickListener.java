/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;
import clicker.applicationlogic.Calculator;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rifqi
 */
public class ClickListener implements ActionListener {
    
    private Calculator calc;
    private JLabel value;
    
    public ClickListener(Calculator calc, JLabel value){
        
        this.calc = calc;
        this.value = value;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        calc.increase();
        value.setText(Integer.toString(calc.giveValue()));
    }
    
}
