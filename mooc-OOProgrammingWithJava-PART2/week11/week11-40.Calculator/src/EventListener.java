/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Rifqi
 */
public class EventListener implements ActionListener {

    private JButton addition, subtract, reset;
    private JTextField input, output;
    private ApplicationLogic app;

    public EventListener(JButton addition, JButton subtract, JButton reset, JTextField input, JTextField output) {

        this.addition = addition;
        this.subtract = subtract;
        this.reset = reset;
        this.input = input;
        this.output = output;
        this.app = new ApplicationLogic();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int value = 0;

        try {
            value = Integer.parseInt(input.getText());
        } catch (Exception e) {
        }

        if (ae.getSource() == addition) {
            app.plus(value);
        } else if (ae.getSource() == subtract) {
            app.minus(value);
        } else {
            app.clear();
        }

        int result = app.result();

        input.setText("");
        output.setText(Integer.toString(result));

        if (result == 0) {
            reset.setEnabled(false);
        } else {
            reset.setEnabled(true);
        }

    }

}
