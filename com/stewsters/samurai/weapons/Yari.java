package com.stewsters.samurai.weapons;

import java.util.Random;

import com.stewsters.samurai.Man;

//spear
public class Yari implements Weapon
{
	public int sharpness;
	public int length;

	@Override
	public int getRange()
	{
		return length;
	}
	@Override
	public void dealDamage(Man m)
	{
		Random r = new Random();
		m.life -= Math.max(0, r.nextInt(sharpness-m.armor));
	}
	
	public Yari()
	{
		length = 3;
		sharpness = 4;
	}
}