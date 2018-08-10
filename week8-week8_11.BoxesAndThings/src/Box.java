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

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> stored;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.stored = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0.0;
        
        for (ToBeStored i : this.stored) {
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.stored.size() + " things, total weight " + weight() + " kg";
    }

    public void add(ToBeStored stored) {

        if (stored.weight() + this.weight() <= this.maxWeight) {
            this.stored.add(stored);
        }
    }
}
