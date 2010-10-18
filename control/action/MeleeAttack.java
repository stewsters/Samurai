package control.action;

import java.util.Random;

import utility.Distance;
import control.Attacker;
import control.Defender;

public class MeleeAttack extends Action
{
	Attacker attacker;
	Defender defender;
	
	
	public MeleeAttack(Attacker _attacker, Defender _defender)
	{
		attacker = _attacker;
		defender = _defender;
	}
	
	public void execute()
	{
		Random r = new Random();
		
		//check range
		int distanceToTarget = Distance.getDistanceSquared(attacker.getLocation(),defender.getLocation());
		if ((attacker.getRange()^2) < distanceToTarget)
		{
			//Target too far, not enough range;
			return;
		}
		//attempt to hit
		int dodge = defender.getDodge();
		int attack = attacker.getAttack();
		if (r.nextInt(10)+dodge >= r.nextInt(10)+attack)
		{	
			//miss
			return;
		}
		
		
		int armor = defender.getArmor();
		int piercing = attacker.getPiercing();
		//if hit, attempt to bypass armor,
		if(r.nextInt(10)+armor > r.nextInt(10)+piercing)
		{
			//hit armor
			return;
		}
		
		//damage
		defender.injure(attacker.getDamage());
	}
	
}
