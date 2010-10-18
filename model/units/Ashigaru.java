package model.units;

import java.util.Random;

import model.weapons.Yari;


public class Ashigaru extends Bushi
{
	public Ashigaru()
	{
		Random r = new Random();
		armor += (r.nextInt(3)); //give 1-3 armor
		life += r.nextInt(2); //give life
		weapon = new Yari(); //give weapon
	}
}
