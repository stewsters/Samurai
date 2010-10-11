package com.stewsters.samurai;

import com.stewsters.samurai.enums.Gender;
import com.stewsters.samurai.enums.SocialClass;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Samurai musashi = new Samurai();
		Samurai tokugawa = new Samurai();
		
		musashi.print();
		tokugawa.print();
		
		musashi.attack(tokugawa);
		tokugawa.attack(musashi);
		
		musashi.print();
		tokugawa.print();
		
		for(int i =0; i < 100; i++)
		{
			System.out.println(NameGenerator.getName(SocialClass.SAMURAI, Gender.MALE));
		}
		
		
	}

}
