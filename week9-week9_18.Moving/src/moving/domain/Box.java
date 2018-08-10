/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Joak
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > this.maximumCapacity) {
            return false;
        } 
        this.box.add(thing);
        return true;
    }

    @Override
    public int getVolume() {
        int totalWeight = 0;
        for (Thing thing : this.box) {
            totalWeight += thing.getVolume();
        }
        return totalWeight;
    }

}
