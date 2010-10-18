package model.units;

import model.weapons.Weapon;
import control.Attacker;
import control.Defender;

public class Bushi extends Man implements Attacker
{
	public int horsemanship;
	public Weapon weapon;
	public int dodge;
	
	public int tactics;
	public int bravery;
	public int leadership;
	
	//This should be in control
	public void attack(Defender m)
	{
		m.injure(weapon.getDamage());
	}

	@Override
	public int getDodge()
	{
		// TODO Auto-generated method stub
		return dodge;
	}

	@Override
	public int getAttack()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDamage()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPiercing()
	{
		return weapon.getPiercing();
	}

	@Override
	public int getRange()
	{
		
		return weapon.getRange();
	}
}
