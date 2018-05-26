package com.cts.ArrayTest;

import java.util.Arrays;

import com.cts.Array.DeleteElement;

public class DeleteElementTest
{

	public static void main(String[] args) 
	{
	int[] a= {12,13,14,16};
	String[] names= {"Shaz","Muzu","Shan","Shaf"};
	DeleteElement ie=new DeleteElement();
	System.out.println(Arrays.toString(ie.Insertion(a, 2, 15)));
	System.out.println(Arrays.toString(ie.deleteElement(names,"Muzu")));
	}

}
