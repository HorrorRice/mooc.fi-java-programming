package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JRadioButton firstOpt = new JRadioButton("No reason.");
        JRadioButton secondOpt = new JRadioButton("Because it is fun!");
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(firstOpt);
        btnGroup.add(secondOpt);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        container.add(firstOpt);
        container.add(secondOpt);
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }

}
