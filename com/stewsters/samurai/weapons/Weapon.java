package com.stewsters.samurai.weapons;

import com.stewsters.samurai.units.Man;

public interface Weapon
{
	//spear is 3d4, 1d4
	//sword is 2d6
	
	//size,damage,aa
	
	public int getRange();
	
	
	public int getDamage();

	/*
	 * In close quarters combat, small works better.  In open field combat
	 * larger works better
	 */
	public int getSize();
}
