package com.stewsters.samurai.Units;

import java.util.Random;

import com.stewsters.samurai.NameGenerator;
import com.stewsters.samurai.enums.Gender;
import com.stewsters.samurai.enums.SocialClass;

public class Man
{
	public String name;	
	
	public int life;
	public int speed;
	public int armor;
	
	public Man()
	{
		Random r = new Random();
		name = NameGenerator.getName(SocialClass.SAMURAI, Gender.MALE);
		life = 6 + r.nextInt(4); //6-10
		speed = 2; //speed 2 default
		armor = 0; //no armor by default
	}
}
