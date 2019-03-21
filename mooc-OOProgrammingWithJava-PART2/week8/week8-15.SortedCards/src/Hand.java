
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card eachCardOnHand : this.hand) {
            System.out.println(eachCardOnHand);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand other) {
        int hand1 = 0;
        int hand2 = 0;

        for (Card eachCardOnHand : this.hand) {
            hand1 += eachCardOnHand.getValue();
        }
        for (Card eachCardOnHand : other.hand) {
            hand2 += eachCardOnHand.getValue();
        }

        if (hand1 > hand2) {
            return 1;
        } else if (hand1 == hand2) {
            return 0;
        } else {
            return -1;
        }
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());

    }
}
