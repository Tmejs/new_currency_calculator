
import com.mycompany.new_currency_calculator.KlasaTestowa;
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
public class TestowaTomasz {
    
    @Test
    public void testowaomasz (){
        //Stworzenie obiektu
        KlasaTestowa obektKlasy1KlasaTestowa=new KlasaTestowa();
        
        //test
        Assert.assertEquals(5,obektKlasy1KlasaTestowa.liczba3(3, 2));
        
        
    }
    
}
