package com.stewsters.samurai.Units;

import com.stewsters.samurai.weapons.Weapon;

public class Bushi extends Man
{
	public int horsemanship;	
	public Weapon weapon;
	public void attack(Man m)
	{
		weapon.dealDamage(m);
	}
}
