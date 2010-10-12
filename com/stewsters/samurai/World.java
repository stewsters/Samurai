package com.stewsters.samurai;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;


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
		dateTime.setFullDate(1600,5,12, 10,1,12);
	}
	
	public static void step()
	{//advance the battle a set period of time.
		
	}
	
}
