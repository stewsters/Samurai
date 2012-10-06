package com.stewsters.samurai.control;

import javax.vecmath.Tuple2i;

/*
 * This is something that can do damage to a Defender
 */
public interface Combattant
{
	public int getDamage();
	public Tuple2i getLocation();
	public int getRange();
	public int getAttack();
	public int getPiercing();

    public void injure(int damage);
    public int getDodge();
    public int getArmor();
}
