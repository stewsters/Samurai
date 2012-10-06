package com.stewsters.samurai.model.units;

import com.stewsters.samurai.control.Combattant;
import com.stewsters.samurai.model.enums.Gender;
import com.stewsters.samurai.model.enums.SocialClass;
import com.stewsters.samurai.model.world.NameGenerator;
import com.stewsters.samurai.utility.Location;

import javax.vecmath.Tuple2i;
import java.util.Random;

public abstract class Man implements Combattant {
    public String name;
    public Gender gender;

    //used for max armor capacity, also armor penetration + damage bonus
    public int power;

    public int finesse; //used for dodge, also to hit
//	public int reaction; // speed to react to 

    public int life;
    public int armor; //chance to ignore damage/ reduce

    public int discipline; //resistace to fear, perhaps fear builds?

    public int speed;// not sure yet, perhaps horses will alter this

    public Location location;
    //public int unarmed;
    //skill for weapon

    public Man() {
        Random r = new Random();
        gender = Gender.MALE;
        name = NameGenerator.getName(SocialClass.SAMURAI, gender);

        power = 1;
        finesse = 1;
        discipline = 1;

        life = 6 + r.nextInt(4); //6-10
        speed = 2; //speed 2 default
        armor = 0; //no armor by default
        location = new Location(2, 2);
    }

    //attempt to resist and save, else just take it
    public void injure(int damage) {
        life -= damage;
    }

    public Tuple2i getLocation() {
        return location;
    }

    public int getArmor() {
        return armor;
    }
}