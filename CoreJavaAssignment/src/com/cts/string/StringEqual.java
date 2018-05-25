package com.cts.string;

public class StringEqual {
	public  boolean stringCompare(String str1,String str2)
	{
		int length1=str1.length();
		int length2=str2.length();
			if (length1==length2)
				for(int i=0;i<length1;i++)
					if(str1.charAt(i)==str2.charAt(i))
						return true;
		
		return false;

	}
}
