package com.cts.java.sample;

//should use the same factorial function and call 3 times.
public class nCr
{
	public double nCrnum(int n, int r)
	{
		
		Factorial factobj=new Factorial();
		int temp=n-r;
		int a=factobj.factorialnum(n);
		int b=factobj.factorialnum(temp);
		int c=factobj.factorialnum(r);
		
		return a/(b*c);
 		
     }

}
