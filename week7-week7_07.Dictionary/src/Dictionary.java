/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap <String, String> dic;

    public Dictionary() {
        this.dic = new HashMap <String, String>();
    }
    
    public String translate(String word) {
        return this.dic.get(word);
    }
    
    public void add(String word, String translation) {
        this.dic.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dic.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList <String> list = new ArrayList <String>();
        
        for (String key : this.dic.keySet()) {
            list.add(key + " = " + this.dic.get(key));
        }
        return list;
    }
}
