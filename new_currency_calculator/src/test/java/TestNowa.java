
import com.mycompany.new_currency_calculator.Nowa;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tmejs (mateusz.rzad@gmail.com)
 */
public class TestNowa {



@Test
public void testTestowa(){
    Nowa nowa=new Nowa();
    Assert.assertEquals(1,nowa.testowaFunkcja());
            
    
}
}

