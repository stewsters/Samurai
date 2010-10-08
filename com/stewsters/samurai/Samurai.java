package com.stewsters.samurai;

import java.util.Random;

import com.stewsters.samurai.weapons.Katana;
import com.stewsters.samurai.weapons.Weapon;

public class Samurai extends Man
{
	public int id;
	public String familyName;
	public String personalName;
	
	
	/*
 	public int life;
	public int speed;
	public int armor;
	 */
	public Weapon weapon;
	
	public Samurai()
	{
		Random r = new Random();
		armor += (1+r.nextInt(3)); //give 1-3 armor
		life += r.nextInt(3); //give life
		weapon = new Katana();//give weapon
		
		NameGenerator.getName("Samurai",NameGenerator.male);
	}
	
	public void attack(Man m)
	{
		weapon.dealDamage(m);
	}
	
	public void print()
	{
		System.out.println("Life:" + life);
		System.out.println("Speed:"+ speed);
		System.out.println("Armor:"+ armor);
	}
}
