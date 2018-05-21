package com.cts.java.sample;

public class PrintBox
{
	public void display(int n)
	{
		int i;
        for (i = 1; i <= n; i++)
        {
            
                if (i == 1  ||i == 5)              
                    System.out.println(" _____");
				else
					System.out.println("|    |");
				
					           
            }
           
        }
      
}
