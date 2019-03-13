package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        container.setLayout(new GridLayout(3, 1));
        JTextField topText = new JTextField("I was copied here from the JTextArea");
        JLabel bottomText = new JLabel();
        JButton btn = new JButton("Copy!");
        
        container.add(topText);
        container.add(btn);
        btn.addActionListener(new AreaCopier(topText, bottomText));
        container.add(bottomText);
    }
}
