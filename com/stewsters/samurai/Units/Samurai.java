package com.stewsters.samurai.Units;

import java.util.Random;

import com.stewsters.samurai.weapons.Katana;

public class Samurai extends Bushi
{
	public int id;
	
	public Samurai()
	{
		Random r = new Random();
		armor += (1+r.nextInt(3)); //give 1-3 armor
		life += r.nextInt(3); //give life
		weapon = new Katana();//give weapon
	}
		
	public void print()
	{
		System.out.println("Life:" + life);
		System.out.println("Speed:"+ speed);
		System.out.println("Armor:"+ armor);
	}
}