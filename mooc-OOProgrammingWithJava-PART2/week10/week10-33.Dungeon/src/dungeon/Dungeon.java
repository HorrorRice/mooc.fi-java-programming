/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class Dungeon {

    private Player player;
    private List<Vampire> vampires = new ArrayList<Vampire>();
    private int width, height, batteryPoint;
    private Scanner r;
    private boolean canVampireMove;

    public Dungeon(int width, int height, int vampires, int moves, boolean vampiresMove) {

        this.player = new Player("@", width, height);
        this.width = width;
        this.height = height;
        this.batteryPoint = moves;
        this.canVampireMove = vampiresMove;
        this.r = new Scanner(System.in);

        for (int i = 0; i < vampires; i++) {
            this.vampires.add(new Vampire(width, height));
        }

    }

    public void run() {
        while (batteryPoint > 0) {
            printStats();
            while (isVampiresCollides()) {
                resetPos();
            }

            printMap();
            movePlayer();

            if (vampires.size() == 0) {
                System.out.println("YOU WIN");
                break;
            }

            batteryPoint--;
        }

        if (vampires.size() != 0) {
            System.out.println("YOU LOSE.");
        }
    }

    public void printStats() {
        System.out.println(batteryPoint);
        System.out.println("\n" + player);
        for (Vampire each : vampires) {
            System.out.println(each);
        }
        System.out.println();
    }

    public boolean getVampires(int x, int y) {
        for (int v = 0; v < vampires.size(); v++) {
            if (vampires.get(v).getPos().equals(x + " " + y)) {
                return true;
            }
        }

        return false;
    }

    public void printMap() {

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (player.getPos().equals(x + " " + y)) {
                    System.out.print(player.getSymbol());

                } else if (getVampires(x, y)) {
                    System.out.print("v");

                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

    public void movePlayer() {
        char[] input = r.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            player.KeyPressed(input[i]);
            if (canVampireMove) {
                moveVampires();
            }

            playerKillVampire();
        }
    }

    public void moveVampires() {

        while (true) {
            for (Vampire v : vampires) {
                v.move();
            }
            if (isVampiresCollides()) {
                new ArrayList<Vampire>(vampires);
            }

            break;
        }
    }

    public void playerKillVampire() {
        // player kill vampires if they met (collide).
        for (int v = 0; v < vampires.size(); v++) {
            if (player.getPos().equals(vampires.get(v).getPos())) {
                vampires.remove(v);
            }
        }
    }

    public boolean isVampiresCollides() {
        /*check if a vampires are on the same position*/
        for (int v1 = 0; v1 < this.vampires.size() - 1; v1++) {
            for (int v2 = v1 + 1; v2 < this.vampires.size(); v2++) {
                if (this.vampires.get(v1).getPos().equals(this.vampires.get(v2).getPos())) {
                    return true;
                }
            }
        }

        return false;
    }

    public void resetPos() {
        // reset vampires position.
        for (Vampire v : vampires) {
            v.resetPos();
        }
    }

}
