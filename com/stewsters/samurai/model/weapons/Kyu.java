package com.stewsters.samurai.model.weapons;

import java.util.Random;


/*
* Longbow, this will need some work.
*
* I'm thinking we should make this implement a rangedweapon.  it will use a different sort of attack.
*/
public class Kyu implements Weapon {
    //precision - avg seconds of arc difference.
    //strength - affects max range
    int sharpness;
    int range = 40;
    int arrows = 20;


    @Override
    public int getRange() {
        return range;
    }

    @Override
    public int getDamage() {
        // TODO Auto-generated method stub
        Random r = new Random();
        return Math.max(0, r.nextInt(sharpness));
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 3;
    }

    public int getPiercing() {
        return 5;
    }

}