package com.stewsters.samurai.model.units;

import com.stewsters.samurai.control.Combattant;

public class Ninja extends Bushi implements Combattant {

    //Can appear as a different man
    public boolean incognito;
    public Man disquise;
    public int stealth;

    public Ninja() {
        incognito = false;
        stealth = 10;
    }

    public void Disguise(Man man) {
        disquise = man;
    }
}
