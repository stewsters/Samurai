package control;

import model.enums.Gender;
import model.enums.SocialClass;
import model.units.Samurai;
import model.world.NameGenerator;
import model.world.World;
import control.action.MeleeAttack;


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
