package com.cts.java.sampletest;
import com.cts.java.sample.Number;
public class NumberTest 
{

	public static void main(String[] args)
	{
		
			Number number=new Number();
			System.out.println("Sum of 2 numbers  "+number.sum(3,4));
			System.out.println("Sum of 3 numbers  "+number.sum(number.sum(3,4),10));
			System.out.println("Biggest of 2 numbers  "+number.big(5,6));
			System.out.println("The given number is even:  "+number.evenodd(6) );
			
	}

}
