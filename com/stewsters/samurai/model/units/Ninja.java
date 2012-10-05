package com.stewsters.samurai.model.units;

public class Ninja extends Bushi {

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
