/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.*;
import wormgame.game.WormGame;

/**
 *
 * @author Rifqi
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame game;
    private int side;

    public DrawingBoard(WormGame game, int pieceLength) {
        this.game = game;
        this.side = pieceLength;
    }

    @Override
    public void update() {
        super.repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        Apple o = game.getApple();
        g.fillOval(side * o.getX(), side * o.getY(), side, side);

        g.setColor(Color.BLACK);
        for (Piece p : game.getWorm().getPieces()) {
            g.fill3DRect(side * p.getX(), side * p.getY(), side, side, true);
        }

    }

}
