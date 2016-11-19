/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.new_currency_calculator;

/**
 *
 * @author krzysztofwojdak
 */
public class Krzeslo {

    int iloscKrzesel;
    int iloscPokoi;

    public int ile(int x, int y) {

        iloscKrzesel = x;
        iloscPokoi = y;

        int lacznaIlosc;
        lacznaIlosc = x * y;

        System.out.println("Trzeba zakupic krzesel " + lacznaIlosc);
        return 1;
    }
}
