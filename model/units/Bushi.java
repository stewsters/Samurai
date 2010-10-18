package model.units;

import model.weapons.Weapon;

import control.Defender;

public class Bushi extends Man
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
}
