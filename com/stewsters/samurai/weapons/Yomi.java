package com.stewsters.samurai.weapons;

import com.stewsters.samurai.Man;

public class Yomi implements Weapon
{
	//precision - avg seconds of arc difference.
	//strength - affects max range
	
	int range = 40;
	@Override
	public int getRange()
	{
		return range;
	}

	@Override
	public void dealDamage(Man m)
	{
		// TODO Auto-generated method stub
		
	}

}