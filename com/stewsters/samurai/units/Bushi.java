package com.stewsters.samurai.units;

import com.stewsters.samurai.control.Defender;
import com.stewsters.samurai.weapons.Weapon;

public class Bushi extends Man
{
	public int horsemanship;
	public Weapon weapon;
	
	//This should be in control
	public void attack(Defender m)
	{
		m.injure(weapon.getDamage());
	}
}
