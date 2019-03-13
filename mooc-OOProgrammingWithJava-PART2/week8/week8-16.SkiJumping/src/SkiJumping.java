
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class SkiJumping {

    private ArrayList<Integer> judges;
    private Random random;
    private int jump;

    public SkiJumping() {

        this.random = new Random();
        this.judges = new ArrayList<Integer>();

    }

    public ArrayList<Integer> getVotes() {

        return this.judges;
    }

    public void votes() {

        for (int i = 0; i < 5; i++) {
            this.judges.add(this.random.nextInt(20 - 10) + 10);
        }

    }

    public void jump() {
        this.jump = this.random.nextInt(120 - 60) + 60;
    }

    public int getJump() {

        return this.jump;

    }

    public int setPoint() {

        int i = 0;
        for (int each : this.judges) {
            i += each;
        }
        
        i -= Collections.min(this.judges);
        i -= Collections.max(this.judges);

        return i + getJump();
    }

}
