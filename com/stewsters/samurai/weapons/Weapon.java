package com.stewsters.samurai.weapons;

import com.stewsters.samurai.Units.Man;

public interface Weapon
{
	//spear is 3d4, 1d4
	//sword is 2d6
	
	public int getRange();
	public void dealDamage(Man m);
}
