package com.cts.java.sampletest;
import com.cts.java.sample.*;
public class DeleteElementTest
{

	public static void main(String[] args) 
	{
	int[] a= {12,13,14,16};
	String[] names= {"Shaz","Muzu","Shan","Shaf"};
	DeleteElement ie=new DeleteElement();
	System.out.println(ie.deleteElementpos(a, 2, 15));
	System.out.println(ie.deleteElement(names));
	}

}
