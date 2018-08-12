/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Joak
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> remover;
    private int numberOfDup;

    public PersonalDuplicateRemover() {
        this.remover = new HashSet<String>();
        this.numberOfDup = 0;
    }
    
    @Override
    public void add(String characterString) {
                if(this.remover.contains(characterString)) {
            this.numberOfDup++;
        }
        this.remover.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.numberOfDup;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.remover;
    }

    @Override
    public void empty() {
        this.remover.removeAll(remover);
        this.numberOfDup = 0;
    }
    
}
