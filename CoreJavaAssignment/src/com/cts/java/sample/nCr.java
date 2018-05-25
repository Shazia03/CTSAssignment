package com.cts.java.sample;

//should use the same factorial function and call 3 times.
public class nCr
{
	public double nCrnum(int n, int r)
	{
 		int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r;
 		if(r>n-r)
 		{
 			temp1 =r;
 			temp2 =n-r;
 		}
 		for(int i=1;i<=n;i++)
 		{
 			if(i<=temp2)
 			{
 				rfact *= i;
 				nrfact *= i;
 			}
 			else if(i<=temp1)
 			{
 				nrfact *= i;
 			}
 			nfact *= i;
 		}
 		return nfact/(double)(rfact*nrfact);
     }

}
