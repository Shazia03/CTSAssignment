package com.cts.java.sample;

public class PatternDescending
{
	public void display(int n)
	{
		 for (int i = 1; i <= n; i++) 
	        {
	            for (int j = n; j >= i; j--)
	            {
	                System.out.print("*");
	            }
	             
	            System.out.println();
	        }
	}
}
