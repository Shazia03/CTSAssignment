package com.cts.java.sample;

public class BiggestElement
{
	public int biggestnum(int a[])
 	{
		int max = a[0];  
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
      
        return max;
 	}
	public int biggestnumindex(int a[])
 	{
		int max = a[0];  
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = i;
      
        return max+1 ;
 	}
	
}
