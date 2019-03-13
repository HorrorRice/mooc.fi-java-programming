
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField input = new JTextField();
        JTextField output = new JTextField("0");
        output.setEnabled(false);

        container.add(output);
        container.add(input);

        container.add(operationPanel(input, output));

    }

    public JFrame getFrame() {

        return frame;
    }

    private JPanel operationPanel(JTextField input, JTextField output) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        JButton addition = new JButton("+");
        JButton subtract = new JButton("-");
        JButton reset = new JButton("Z");
        reset.setEnabled(false);
        
        EventListener handler = new EventListener(addition, subtract, reset, input, output);
        
        addition.addActionListener(handler);
        subtract.addActionListener(handler);
        reset.addActionListener(handler);
        
        panel.add(addition);
        panel.add(subtract);
        panel.add(reset);

        return panel;
    }

}
