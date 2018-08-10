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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thermometer therm = new Thermometer();
        therm.isOn();
    }
}
