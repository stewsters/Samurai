package com.stewsters.samurai.Units;

import java.util.Random;

import com.stewsters.samurai.weapons.Yari;

public class Ashigaru extends Bushi
{
	public Ashigaru()
	{
		Random r = new Random();
		armor += (r.nextInt(3)); //give 1-3 armor
		life += r.nextInt(2); //give life
		weapon = new Yari();//give weapon
	}
}
