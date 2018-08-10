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

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
        
public class NewMain {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
    }

}
