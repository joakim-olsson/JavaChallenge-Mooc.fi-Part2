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

public class Suitcase {

    private int weightLimit;
    private ArrayList<Thing> things;
    private int totalWeight;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight <= this.weightLimit) {
            things.add(thing);
            this.totalWeight += thing.getWeight();
        }
    }

    @Override
    public String toString() {

        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight + " kg)";
        } else {
            return this.things.size() + " things (" + this.totalWeight + " kg)";
        }
    }

    public void printThings() {
        for (Thing i : things) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Thing heaviestThing() {
        Thing helper;
        if (this.things.isEmpty()) {
            return null;
        } else {
            helper = things.get(0);
            for (Thing i : things) {
                if (helper.getWeight() < i.getWeight()) {
                    helper = i;
                }
            }
        }
        return helper;
    }
}
