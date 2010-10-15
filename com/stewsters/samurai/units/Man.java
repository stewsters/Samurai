package com.stewsters.samurai.units;

import java.util.Random;

import com.stewsters.samurai.NameGenerator;
import com.stewsters.samurai.control.Defender;
import com.stewsters.samurai.enums.Gender;
import com.stewsters.samurai.enums.SocialClass;

public abstract class Man implements Defender
{
	public String name;	
	public Gender gender;
	
	public int power;
	public int finnesse;
	
	public int life;
	public int armor;
	public int discipline;
	public int speed;
	
	
	public Man() 
	{
		Random r = new Random();
		gender = Gender.MALE;
		name = NameGenerator.getName(SocialClass.SAMURAI, gender);
		
		power = 1;
		finnesse = 1;
		discipline = 1;
		
		life = 6 + r.nextInt(4); //6-10
		speed = 2; //speed 2 default
		armor = 0; //no armor by default
	}
	
	//attempt to resist and save, else just take it
	public void injure(int damage)
	{
		life -= damage;
	}
	
}
