package wormgame.gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import wormgame.game.WormGame;

public class UserInterface implements Runnable {

    private JFrame frame;
    private WormGame game;
    private int sideLength;
    private DrawingBoard db;

    public UserInterface(WormGame game, int sideLength) {
        this.game = game;
        this.sideLength = sideLength;
    }

    @Override
    public void run() {
        frame = new JFrame("Worm Game");
        int width = (game.getWidth() + 1) * sideLength + 10;
        int height = (game.getHeight() + 2) * sideLength + 10;

        frame.setPreferredSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        
        db = new DrawingBoard(game, sideLength);
        container.add(db);
        KeyboardListener n = new KeyboardListener(game.getWorm());
        getFrame().addKeyListener(n);
    }

    
    public Updatable getUpdatable() {
        return db;
    }

    public JFrame getFrame() {
        return frame;
    }
}