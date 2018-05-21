package com.cts.java.sampletest;
import com.cts.java.sample.*;
public class BiggestElementTest 
{

	public static void main(String[] args) 
	{
		int[] num={30,19,99,786,70654};
		BiggestElement be=new BiggestElement();
		System.out.println(be.biggestnum(num));
		System.out.println(be.biggestnumindex(num));

	}

}
