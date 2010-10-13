package com.stewsters.samurai.Units;

public class Ninja extends Bushi
{

	//Can appear as a different man
	public boolean incognito;
	public Man disquise;
	public int stealth;
	
	public Ninja()
	{
		incognito = true;
		disquise = new Man();
		stealth = 10;
	}
}
