package com.cts.java.sample;
public class Grade
{
	public String average(int x,int y,int z)
	{
		int avg=(x+y+z)/3;
		
		if(avg>90)
			return "A+";
		
		if (avg>=80)
			return "A";
		 
		if(avg>=70)
			return "A-";
		
		if (avg>=60)
			return "B+";
		
		if (avg>=50)
			return "B";
		
		//if(avg<50)
			return "Fail";
		
		
		}

}
