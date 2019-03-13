package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc){
        
        this.calc = calc;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        JLabel value = new JLabel("0");
        JButton click = new JButton("Click!");
        
        ClickListener cl = new ClickListener(calc, value);
        click.addActionListener(cl);
        
        container.add(value);
        container.add(click, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
