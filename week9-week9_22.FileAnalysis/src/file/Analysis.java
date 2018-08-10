/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joak
 */
public class Analysis {

    private Scanner scanner;
    private List<String> lines;

    public Analysis(File file) throws Exception {
        this.scanner = new Scanner(file);
        this.lines = new ArrayList<String>();

        while (this.scanner.hasNextLine()) {
            this.lines.add(scanner.nextLine());
        }
    }

    public int lines() {
        return this.lines.size();
    }

    public int characters() {
        int numChars = 0;
        for (String string : this.lines) {
            numChars += string.length() + 1;
        }
        return numChars;
    }
}
