/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author Rifqi
 */
public class Worm {

    private List<Piece> worm = new ArrayList<Piece>();
    private int x;
    private int y;
    private Direction direction;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {

        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.worm.add(new Piece(x, y));
        this.grow = false;

    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return worm.size();
    }

    public List<Piece> getPieces() {
        return worm;
    }

    public void move() {

        int newX = worm.get(worm.size() - 1).getX();
        int newY = worm.get(worm.size() - 1).getY();

        if (direction == Direction.RIGHT) {
            newX++;

        } else if (direction == Direction.LEFT) {
            newX--;

        } else if (direction == Direction.DOWN) {
            newY++;

        } else {
            newY--;
        }

        if (!grow && getLength() > 2) {
            worm.remove(0);

        } else {
            grow = false;
        }

        worm.add(new Piece(newX, newY));

    }

    public void grow() {
        grow = true;
    }

    public boolean runsInto(Piece piece) {

        for (Piece p : getPieces()) {
            if (collide(p, piece)) {
                return true;
            }

        }
        return false;
    }

    public boolean runsIntoItself() {

        for (int i = 0; i < getLength() - 1; i++) {
            if (wormHead().runsInto(wormBody(i))) {
                return true;
            }
        }

        // Alternate way to check if worm runs into itself 1
//        for (int i = 0; i < getLength() - 1; i++) {
//            if (worm.get(getLength() - 1).getX() == worm.get(i).getX()
//                    && worm.get(getLength() - 1).getY() == worm.get(i).getY()) {
//                return true;
//            }
//        }

        // Alternate way to check if worm runs into itself 2:
//        for(int i = 0; i < getLength() - 1; i++){
//            if(worm.get(getLength() - 1).runsInto(worm.get(i))){
//                return true;
//            }
//        }

        // Alternate way to check if worm runs into itself 3:
//        for (int i = 0; i < getLength() - 1; i++) {
//            if (collide(wormHead(), (wormBody(i)))) {
//                return true;
//            }
//        }

        return false;
    }

    private Piece wormBody(int i) {
        return worm.get(i);
    }

    private Piece wormHead() {
        return worm.get(getLength() - 1);
    }

    private boolean collide(Piece p1, Piece p2) {
        return p1.getX() == p2.getX() && p1.getY() == p2.getY();

    }

}
