package com.stewsters.samurai;

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
		
		
		
	}

}
