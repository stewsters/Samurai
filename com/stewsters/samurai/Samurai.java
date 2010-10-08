package com.stewsters.samurai;

import java.util.Random;

public class Samurai extends Man
{
	/*
 	public int life;
	public int speed;
	public int armor;
	 */
	public Weapon weapon;
	
	public Samurai()
	{
		Random r = new Random();
		//give armor
		armor += 1+r.nextInt(2); //1-3 armor
		//give life
		//give weapon
		
		weapon = new Katana();
	}
	
	public void attack(Man m)
	{
		weapon.dealDamage(m);
	}
	
	public void print()
	{
		System.out.println("Life:"+life);
		System.out.println("Speed:"+speed);
		System.out.println("Armor:"+armor);
	}
}
