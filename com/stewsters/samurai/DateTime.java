package com.stewsters.samurai;

public class DateTime
{
	private int year = 1600;
	private int month = 5;
	private int day = 12;
	private int hour = 12;
	private int minute = 1;
	private int second = 23;
	
	
	public DateTime()
	{
		year = month = day = hour = minute = second = 0;
	}
	public void setFullDate(int _year, int _month, int _day, int _hour, int _minute, int _second)
	{
		year = _year;
		month = _month;
		day = _day;
		hour = _hour;
		minute = _minute;
		second = _second;
	}
	
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getHour()
	{
		return hour;
	}
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public void setMinute(int minute)
	{
		this.minute = minute;
	}
	public int getSecond()
	{
		return second;
	}
	public void setSecond(int second)
	{
		this.second = second;
	}
	
	
	public void incrementSecond(int _second)
	{
		second += _second;
		int min = (int) ((60)*Math.floor(second / 60));
		incrementMinute(min);
		second = second - (min * 60);
	}
	
	public void incrementMinute(int _minute)
	{
		minute += _minute;
		int hr = (int) ((60)*Math.floor(minute / 60));
		incrementHour(hr);
		minute = minute - (hr * 60);
	}
	
	public void incrementHour(int _hour)
	{
		hour += _hour;
		int dy = (int) ((24)*Math.floor(hour / 24));
		incrementDay(dy);
		hour = hour - (dy * 24);
	}
	
	public void incrementDay(int _day)
	{
		day += _day;
		int mo = (int) ((30)*Math.floor(day / 30));
		incrementMonth(mo);
		day = day - (mo * 30);
	}
	
	public void incrementMonth(int _month)
	{
		month += _month;
		int yr = (int) ((12)*Math.floor(month / 12));
		incrementYear(yr);
		month = month - (yr * 30);
	}
	
	public void incrementYear(int _year)
	{
		year += _year;
	}
}