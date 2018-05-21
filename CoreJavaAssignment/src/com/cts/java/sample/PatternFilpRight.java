package com.cts.java.sample;

public class PatternFilpRight
{
	public void display(int n)
	{
		 for (int i= n; i>=1; i--) 
	        {
	            for (int j = i; j >= 1; j--)
	            {
	                System.out.print("*");
	            }
	             
	            System.out.println();
	        }
	}

}
