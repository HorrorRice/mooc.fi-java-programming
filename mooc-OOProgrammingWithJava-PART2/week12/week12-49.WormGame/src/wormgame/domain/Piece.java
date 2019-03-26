/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Rifqi
 */
public class Piece {

    private int x, y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        return x == piece.getX() && y == piece.getY();
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

}
