package com.cts.sample.string;

public class CountLetter {

		public int countNumber( String str, char letter )
		{
		  int numberOfTimes = 0;
		  char[] chars = str.toCharArray();
		 
		  for( int index = 0; index < chars.length; ++index )
		  {
		    if( chars[index] == letter )
		    {
		      ++numberOfTimes;
		    }
		  }
		  
		  return( numberOfTimes );
		}
		
	}


