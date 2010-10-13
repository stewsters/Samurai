package com.stewsters.samurai.weapons;

import java.util.Random;

import com.stewsters.samurai.Units.Man;

public class Katana implements Weapon
{
	public int sharpness;
	
	public Katana()
	{
		Random r = new Random();
		sharpness = 4 + r.nextInt(4);
	}
		
	@Override
	public void dealDamage(Man m)
	{
		Random r = new Random();
		m.life = m.life - Math.max(0, r.nextInt(sharpness) - m.armor);
	}

	@Override
	public int getRange()
	{
		// TODO Auto-generated method stub
		return 1;
	}

}
