package model.weapons;

import java.util.Random;

import model.units.Man;


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
	public int getDamage()
	{
		Random r = new Random();
		return Math.max(0, r.nextInt(sharpness));
	}
	
	public Yari()
	{
		length = 3;
		sharpness = 4;
	}
	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return 4;
	}
}