/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Rifqi
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
// animates the cell whose coordinates are (x, y),
// that is to say it assigns the value true to it.
// If the coordinates are outside the board, nothing happens.        
        if (isInsideTheBoard(x, y)) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
// kills the cell whose coordinates are (x, y), 
// that is to say it assigns the value false to it.
// If the coordinates are outside the board, nothing happens.    
        if (isInsideTheBoard(x, y)) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
// tells whether the cell at (x, y) is alive. If the coordinates are outside the board, the method returns false.
        return isInsideTheBoard(x, y) && getBoard()[x][y] == true;
    }

    @Override
    public void initiateRandomCells(double probability) {
//        probability = 0.0 + (1.0 - 0.0) * new Random().nextDouble();
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (probability >= new Random().nextDouble()) {
                    turnToLiving(x, y);
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
// calculates the number of neighbour cells which are alive.
        int alive = 0;
        for (int width = x - 1; width <= x + 1; width++) {
            for (int height = y - 1; height <= y + 1; height++) {
                if (isAlive(width, height)) {
                    alive++;
                } else if (isAlive(x, y)) {
                    alive--;
                }
            }
        }

        return alive;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
// kill cells if they have less than 2 living neighbours or they have more than 3 living neighbours
// animate cell if they have 2 living neighbours.  

        if (isAlive(x, y)) {
            if (livingNeighbours < 2 || livingNeighbours > 3) {
                turnToDead(x, y);
            }
        } else {
            if (livingNeighbours == 3) {
                turnToLiving(x, y);
            }
        }
    }

    public boolean isInsideTheBoard(int x, int y) {
// check if the cells are inside the board.  
        return !(x >= getWidth() || x < 0 || y >= getHeight() || y < 0);
    }

}
