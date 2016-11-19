import app_structure.Currency;
import app_structure.Note;
import org.junit.Test;
import static junit.framework.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzysztofwojdak
 */

import junit.framework.Assert;
public class TestNote {
    
    @Test
            public void testNote(){
                
                Double wartoscEur = new Double("4.5");
                Double wartoscUsd = new Double("3.5");
                Double wartoscPln = new Double("1.0");


                
                Currency USD = new Currency("Euro", "EUR");
                Currency EUR = new Currency("Dollars", "USD");
                Currency PLN = new Currency("Polskie zlote", "PLN");
                
                Note banknoteEur = new Note(EUR, wartoscEur);
                Note banknoteUsd = new Note(USD, wartoscUsd);
                Note banknotePln = new Note(PLN, wartoscPln);
                
                
                assertEquals("PLN", banknotePln.getCurrency().getShortName());

                
            }            
}
