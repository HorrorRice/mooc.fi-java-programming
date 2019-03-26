/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

/**
 *
 * @author Rifqi
 */


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.domain.*;
import wormgame.Direction;

/**
 *
 * @author costa
 */
public class KeyboardListener implements KeyListener {
    private Worm worm;
    
    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            worm.setDirection(Direction.RIGHT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            worm.setDirection(Direction.LEFT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            worm.setDirection(Direction.UP);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            worm.setDirection(Direction.DOWN);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
   
    
}

