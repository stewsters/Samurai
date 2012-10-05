package com.stewsters.samurai.model.units;

import com.stewsters.samurai.model.weapons.Katana;

import java.util.Random;


public class Samurai extends Bushi {
    public int id;

    public Samurai() {
        Random r = new Random();
        armor += (1 + r.nextInt(3)); //give 1-3 armor
        life += r.nextInt(3); //give life
        weapon = new Katana();//give weapon
    }

    public void print() {
        System.out.println("Life:" + life);
        System.out.println("Speed:" + speed);
        System.out.println("Armor:" + armor);
    }
}