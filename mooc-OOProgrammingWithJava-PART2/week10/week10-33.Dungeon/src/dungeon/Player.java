/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Rifqi
 */
public class Player {

    private final String symbol;
    private int posX, posY, width, height;

    public Player(String symbol, int width, int height) {
        this.symbol = symbol;
        this.posX = 0;
        this.posY = 0;
        this.width = width - 1;
        this.height = height - 1;
    }

    public String getSymbol() {

        return symbol;
    }

    public int getPosX() {

        return posX;

    }

    public int getPosY() {

        return posY;

    }

    public void setPosY(int y) {

        posY = y;
    }

    public void setPosX(int x) {
        posX = x;
    }

    public String getPos() {

        return posX + " " + posY;
    }

    public void KeyPressed(char keyPressed) {
        boolean y = posY > 0;
        boolean h = posY < height;
        boolean x = posX > 0;
        boolean w = posX < width;

        if (keyPressed == ('w')) {
            if (y) {
                posY--;
            }
        } else if (keyPressed == ('s')) {
            if (h) {
                posY++;
            }
        } else if (keyPressed == ('a')) {
            if (x) {
                posX--;
            }
        } else if (keyPressed == ('d')) {
            if (w) {
                posX++;
            }
        }

    }

    @Override
    public String toString() {

        return symbol + " " + posX + " " + posY;
    }

}
