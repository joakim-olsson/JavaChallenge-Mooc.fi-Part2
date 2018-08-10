
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joak
 */
public class Printer {

    private Scanner scanner;
    private List<String> line;

    public Printer(String fileName) throws Exception {
        this.scanner = new Scanner(new File(fileName));
        this.line = new ArrayList<String>();

        while (this.scanner.hasNextLine()) {
            line.add(this.scanner.nextLine());
        }
    }

    public void printLinesWhichContain(String word) {

        for (String i : this.line) {
            if (i.contains(word)) {
                System.out.println(i);
            }
        }
    }
}
