/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_structure;

/**
 * Klasa mapujaca walute
 * @author krzysztofwojdak
 */
public class Currency {
    
    private final String longName;
    private final String shortName;
    

    public Currency(String longName, String shortName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getShortName() {
        return shortName;
    }
    
    
    
    
    
}
