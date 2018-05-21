package com.cts.java.sample;

public class Palindrome
{
	public boolean palindromenum(int n)
    {
	 int temp=n;
    int rev=0;
 	 while(n!=0)
 	 {
 		 rev=rev*10;
 		 rev=rev+n%10;
 		 n=n/10;
 	 }
 	 
 	 if (rev==temp)
 		 return true;
 	 else
 		 return false;
 	 
    }

}
