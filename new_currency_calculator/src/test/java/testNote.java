

import com.mycompany.new_currency_calculator.upstructures.Currency;
import com.mycompany.new_currency_calculator.upstructures.Note;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TKK
 */
public class testNote {
    
    @Test
    public void testNote(){
        Currency dolar =new Currency("PLN", "zl");
       
        Note banknot = new Note(dolar, 0.5);
        
        
                
                Assert.assertEquals("PLN", banknot.getCurrency().getLongName());
                        }
}
