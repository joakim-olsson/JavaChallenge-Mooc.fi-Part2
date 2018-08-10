/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card i : this.cards) {
            System.out.println(i);
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int hand1 = 0;
        int hand2 = 0;
        for (Card i : this.cards) {
            hand1 += i.getValue();
        }
        for (Card i : hand.cards) {
            hand2 += i.getValue();
        }
        return hand1 - hand2;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
