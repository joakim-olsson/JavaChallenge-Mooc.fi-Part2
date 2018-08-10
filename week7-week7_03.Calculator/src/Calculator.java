/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */

public class Calculator {

    private Reader reader;
    private int calcs;

    public Calculator() {
        this.reader = new Reader();
        this.calcs = 0;
    }

    public void start() {

        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        System.out.println("value1: ");
        int val1 = reader.readInteger();
        System.out.println("value2: ");
        int val2 = reader.readInteger();
        int sum = val1 + val2;
        System.out.println("sum of the values " + sum);
        this.calcs++;
    }

    private void difference() {
        System.out.println("value1: ");
        int val1 = reader.readInteger();
        System.out.println("value2: ");
        int val2 = reader.readInteger();
        int difference = val1 - val2;
        System.out.println("difference of the values " + difference);
        this.calcs++;
    }

    private void product() {
        System.out.println("value1: ");
        int val1 = reader.readInteger();
        System.out.println("value2: ");
        int val2 = reader.readInteger();
        int product = val1 * val2;
        System.out.println("product of the values " + product);
        this.calcs++;

    }

    private void statistics() {
        System.out.println("Calculations done " + this.calcs);
    }

}
