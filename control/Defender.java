package control;

import javax.vecmath.Tuple2i;

/*
 * This is someone who can be attacked by an Attacker
 */
public interface Defender
{
	public void injure(int damage);

	public Tuple2i getLocation();
	public int getDodge();
	public int getArmor();
}
