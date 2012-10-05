package com.stewsters.samurai.control;

import com.stewsters.samurai.model.world.World;
import com.stewsters.samurai.model.enums.Gender;
import com.stewsters.samurai.model.enums.SocialClass;
import com.stewsters.samurai.model.units.Samurai;
import com.stewsters.samurai.model.world.NameGenerator;
import com.stewsters.samurai.model.world.World;
import com.stewsters.samurai.control.action.MeleeAttack;


public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		World.init();
		
		
		Samurai musashi = new Samurai();
		Samurai tokugawa = new Samurai();
		
		musashi.print();
		tokugawa.print();
		
		MeleeAttack a = new MeleeAttack(musashi, tokugawa);
		a.activate();
		MeleeAttack b = new MeleeAttack(tokugawa, musashi);
		b.activate();
		//musashi.attack(tokugawa);
		//tokugawa.attack(musashi);
		
		musashi.print();
		tokugawa.print();
		
		for(int i =0; i < 100; i++)
		{
			System.out.println(NameGenerator.getName(SocialClass.SAMURAI, Gender.MALE));
		}
//		NameGenerator.printString();
		
	}

}
