/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Joak
 */
public class Thermometer implements Sensor {
    private boolean isOn;

    public Thermometer() {
        this.isOn = false;
    }
    
    

    @Override
    public boolean isOn() {
        if (this.isOn == true) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn == true) {
        int min = -30;
        int max = 30;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
        }
        throw new IllegalStateException();
    }

}
