package com.cts.sample.Array;

public class SumArray
{
  public int sumofarray(int a[])
  {
	  int sum=0;
	  int size=a.length;
	  for(int i=0;i<size;i++)
	  sum=sum+a[i];
	  return sum;
  }
}
