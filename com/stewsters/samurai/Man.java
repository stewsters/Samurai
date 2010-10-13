package com.stewsters.samurai;

import java.util.Random;

public class Man
{
	public int life;
	public int speed;
	public int armor;
	
	
	
	public Man()
	{
		Random r = new Random();
		life = 6 + r.nextInt(4); //6-10
		speed = 2; //speed 2 default
		armor = 0; //no armor by default
	}
}
