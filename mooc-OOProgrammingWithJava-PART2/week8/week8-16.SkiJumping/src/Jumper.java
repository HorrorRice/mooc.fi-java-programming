
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Jumper implements Comparable<Jumper> {

    private String person;
    private ArrayList<Integer> jumpLength;
    private int point;

    public Jumper(String person, int point) {

        this.point = point;
        this.person = person;
        this.jumpLength = new ArrayList<Integer>();

    }

    public String getPerson() {

        return this.person;
    }

    public int getPoint() {

        return this.point;

    }

    public void addJump(int jumpLength, int point) {

        this.jumpLength.add(jumpLength);
        this.point += point;

    }

    @Override
    public int compareTo(Jumper t) {

        return this.point - t.getPoint();

    }

    public void printJumpLength() {
        int i = 0;
        System.out.print("            jump lengths: ");
        for (int each : jumpLength) {
            if (i < jumpLength.size() - 1) {
                System.out.print(each + "m, ");
            } else {
                System.out.println(each + "m");
            }
            i++;
        }

    }

    public String toString() {

        return this.person + " (" + this.point + " points)";

    }
}
