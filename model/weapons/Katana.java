package model.weapons;

import java.util.Random;

import model.units.Man;


public class Katana implements Weapon
{
	public int sharpness;
	
	public Katana()
	{
		Random r = new Random();
		sharpness = 4 + r.nextInt(4);
	}
		
	@Override
	public int getDamage()
	{
		Random r = new Random();
		return Math.max(0, r.nextInt(sharpness));
	}

	@Override
	public int getRange()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return 2;
	}
	public int getPiercing()
	{
		return 3;
	}

}
