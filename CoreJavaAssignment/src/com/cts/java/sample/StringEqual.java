package com.cts.java.sample;

public class StringEqual
{
public  int stringCompare(String str1,String str2)
{
	for (int i = 0; i < str1.length() && i < str2.length(); i++) {
		if ((int)str1.charAt(i) == (int)str2.charAt(i))
		{
			continue;
		} 
		else 
		{
			
			return (int)str1.charAt(i) - (int)str2.charAt(i);
		}
}

	if (str1.length() < str2.length())
	{
		return (int)str1.charAt(str2.length());
	} 
	else if (str1.length() > str2.length()) 
	{
		return (int)str1.charAt(str2.length());
	}

	else 
	{
		return 0;
	}
}
}
