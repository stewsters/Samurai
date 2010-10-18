package control;

import javax.vecmath.Tuple2i;

/*
 * This is something that can do damage to a Defender
 */
public interface Attacker
{
	public int getDamage();
	public Tuple2i getLocation();
	public int getRange();
	public int getAttack();
	public int getPiercing();
}
