package com.stewsters.samurai.model.weapons;

public interface Weapon {
    //spear is 3d4, 1d4
    //sword is 2d6


    //length/range
    //size,
    //ammo
    //damage,
    //aa

    public int getRange();


    public int getDamage();

    public int getPiercing();

    /*
      * In close quarters combat, small works better.  In open field combat
      * larger works better
      */
    public int getSize();
}
