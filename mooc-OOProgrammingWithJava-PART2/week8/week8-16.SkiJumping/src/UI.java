
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class UI {

    private ArrayList<Jumper> jumpers;
    private Scanner reader;
    private int roundCount = 1;

    public UI() {

        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();

    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");

        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        inputName();

        System.out.println("\nThe tournament begins!");

        jump();

    }

    public void inputName() {

        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            } else {

                this.jumpers.add(new Jumper(name, 0));
            }

        }
    }

    public void jump() {

        while (true) {

            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();

            if (input.equalsIgnoreCase("jump")) {
                roundStart();
            } else {
                break;
            }
        }
        finalResult();

    }

    public void roundStart() {

        System.out.println("\nRound " + roundCount);

        System.out.println("\nJumping order:");

        int n = 1;
        Collections.sort(this.jumpers);
        for (Jumper each : this.jumpers) {
            System.out.println("  " + n++ + ". " + each);

        }

        roundResult();
        roundCount++;

    }

    public void roundResult() {

        System.out.println("\nResults of round " + roundCount);

        for (Jumper each : this.jumpers) {

            SkiJumping event = new SkiJumping();
            event.jump();
            event.votes();
            each.addJump(event.getJump(), event.setPoint());

            System.out.println("  " + each.getPerson());
            System.out.println("    length: " + event.getJump());
            System.out.println("    judge votes: " + event.getVotes());

        }

    }

    public void finalResult() {

        System.out.println("\nThanks!\n");

        Collections.sort(jumpers);
        Collections.reverse(jumpers);

        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        int n = 1;
        for (Jumper i : jumpers) {
            System.out.println(n++ + "           " + i);
            i.printJumpLength();
        }

    }

}
