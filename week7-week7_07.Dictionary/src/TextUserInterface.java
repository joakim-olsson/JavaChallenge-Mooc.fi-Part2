/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.scanner = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Statement: ");
            System.out.println("    add - adds a word pair to the dictionary");
            System.out.println("    translate - asks a word and prints its translation");
            System.out.println("    quit - quit the user interface");
            System.out.print("Statement: ");
            
            String command = this.scanner.nextLine();

            
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        System.out.print("Translation: " + this.dictionary.translate(this.scanner.nextLine()) + "\n");
    }
}
