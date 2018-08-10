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

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> container;
    private int num;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
        this.num = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        int max = 0;

        for (Suitcase i : this.container) {
            max += i.totalWeight();
        }

        if (this.maxWeight - max >= suitcase.totalWeight()) {
            this.container.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int kilos = 0;

        for (Suitcase i : this.container) {
            kilos += i.totalWeight();
        }

        return this.container.size() + " suitcases (" + kilos + " kg)";
    }

    public void printThings() {
        for (Suitcase i : this.container) {
            i.printThings();
        }
    }
}
