package model.world;
import java.util.ArrayList;

import model.units.Man;



public class World
{
	public static ArrayList<Man> man;
	public static int xWidth;
	public static int yWidth;
	
//	public static Date dateTime; //too new
	
	public static DateTime dateTime;
	
	public static void init()
	{
		man = new ArrayList<Man>();
		dateTime = new DateTime();
		dateTime.setFullDate(1600,5,12, 10,1,12);
	}
	
	public static void step()
	{//advance the battle a set period of time.
		
	}
	
}
