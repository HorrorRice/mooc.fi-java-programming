/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Rifqi
 */
public class KeyboardListener implements KeyListener {

    private Figure figure;
    private Component component;

    public KeyboardListener(Component component, Figure figure) {
        this.figure = figure;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 1);
        }

        component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("You pressed LEFT.");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("You pressed RIGHT.");
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("You pressed UP.");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("You pressed DOWN.");
        } else {
            System.out.println("Keystroke " + e.getKeyCode() + " pressed.");
        }
    }

}
