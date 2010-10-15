package com.stewsters.samurai.weapons;

import java.util.Random;

import com.stewsters.samurai.units.Man;

/*
 * Longbow, this will need some work.
 * 
 * I'm thinking we should make this implement a rangedweapon.  it will use a different sort of attack.
 */
public class Yomi implements Weapon
{
	//precision - avg seconds of arc difference.
	//strength - affects max range
	int sharpness;
	int range = 40;
	int arrows = 20;
	
	
	@Override
	public int getRange()
	{
		return range;
	}
	
	@Override
	public int getDamage()
	{
		// TODO Auto-generated method stub
		Random r = new Random();
		return Math.max(0, r.nextInt(sharpness));		
	}

	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return 3;
	}

}