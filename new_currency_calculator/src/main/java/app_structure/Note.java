/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_structure;

/**
 *
 * @author krzysztofwojdak
 */
public class Note {
    
    private final Currency currency;
    
    private Double value;

    public Note(Currency currency, Double value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Double getValue() {
        return value;
    }
    
    
    
    
}
    
    
    

