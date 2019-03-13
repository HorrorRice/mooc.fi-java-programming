/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Rifqi
 */
public abstract class Figure {

    private int x, y;

    public Figure() {

    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public abstract void draw(Graphics graphics);

}
