/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Rifqi
 */
public class Vampire {

    private String symbol = "v";
    private int posX, posY, width, height;
    private final Random rand = new Random();

    public Vampire(int width, int height) {
        this.posX = rand.nextInt(width);
        this.posY = rand.nextInt(height);
        this.width = width - 1;
        this.height = height - 1;

    }

    public int getPosX() {

        return posX;

    }

    public int getPosY() {

        return posY;

    }

    public String getPos() {

        return posX + " " + posY;
    }

    public void setPosX(int x) {

        posX = x;

    }

    public void setPosY(int y) {

        posY = y;
    }

    public void resetPos() {
        
        posX = rand.nextInt(width);
        posY = rand.nextInt(height);
        checkStartPos();
    }

    public void checkStartPos() {
/* check starting position of vampires and player.
        if they collide, reset vampires position. */
        while (posX == 0 || posY == 0) {
            if (posX == 0) {
                posX = rand.nextInt(width);
            } else if (posY == 0) {
                posY = rand.nextInt(height);
            }
        }

    }

    public void move() {
        boolean y = posY > 0;
        boolean h = posY < height;
        boolean x = posX > 0;
        boolean w = posX < width;

        int direction = rand.nextInt(4);
        switch (direction) {
            case 0:
                if (y) {
                    posY--;
                    break;
                }
            case 1:
                if (h) {
                    posY++;
                    break;
                }
            case 2:
                if (x) {
                    posX--;
                    break;
                }
            case 3:
                if (w) {
                    posX++;
                    break;

                }

        }
    }

    @Override
    public String toString() {

        return symbol + " " + posX + " " + posY;
    }

}
