package com.cts.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerArray 
{
	public static void main(String[] args) 
	{
		ArrayListDemo list=new ArrayListDemo();
		 
		List<Integer> integerlist=new ArrayList();
		integerlist.add(10);
		integerlist.add(90);
		integerlist.add(80);
		integerlist.add(70);
		
		System.out.println(list.searchArrayListValue(integerlist,100));
		System.out.println(list.searchArrayListPosition(integerlist,2));
		//System.out.println("Before sort:");
		list.displayUsingForLoop(integerlist);
		//list.displayUsingEnhancedForLoop(integerlist);
		//list.displayUsingIterator(integerlist);
		//System.out.println(integerlist.get(1));
		
		//Collections.sort(integerlist);
		//System.out.println("After sort:");
		//list.displayUsingIterator(integerlist);
		
	}
}
