package com.cts.exceptions;

public class DuplicateUserException extends Exception
{
	public DuplicateUserException ()
	{
	
		System.out.println("User Already Exists");
	}
}
