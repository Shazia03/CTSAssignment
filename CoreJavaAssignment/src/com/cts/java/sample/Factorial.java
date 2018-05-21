package com.cts.java.sample;

public class Factorial 
{
	public int factorialnum(int n)
	{
		 
	       int result = 1;
	       for (int i = 1; i <= n; i++) 
	       {
	           result = result * i;
	       }
		return result;
	}

}
