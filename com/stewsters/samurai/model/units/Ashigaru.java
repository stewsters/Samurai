package com.stewsters.samurai.model.units;

import com.stewsters.samurai.control.Combattant;
import com.stewsters.samurai.model.weapons.Yari;

import java.util.Random;


public class Ashigaru extends Bushi implements Combattant {
    public Ashigaru() {
        Random r = new Random();
        armor += (r.nextInt(3)); //give 1-3 armor
        life += r.nextInt(2); //give life
        weapon = new Yari(); //give weapon
    }
}
