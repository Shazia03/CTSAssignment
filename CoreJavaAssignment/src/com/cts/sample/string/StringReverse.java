package com.cts.sample.string;

public class StringReverse
{
	public  void stringRev(String s)
    {
        
        for (int i =s.length()-1; i >= 0; i--) 
        {            
               System.out.print(s.charAt(i));    
        }
    } 
}
