package com.cts.java.sample;

public class Reverse
{
	public int reversenum(int n)
    {
 	 int rev=0;
 	 while(n!=0)
 	 {
 		 rev=rev*10;
 		 rev=rev+n%10;
 		 n=n/10;
 	}
 	 return rev;
    } 
    

}
