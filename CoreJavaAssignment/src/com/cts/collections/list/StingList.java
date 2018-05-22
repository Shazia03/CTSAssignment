package com.cts.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StingList
{
	public static void main(String[] args) 
	{
		ArrayListDemo list=new ArrayListDemo();
		List<String> stringlist=new ArrayList();
		stringlist.add("Shazia");
		stringlist.add("Misba");
		stringlist.add("Muzu");
		System.out.println(list.searchArrayListPosition(stringlist, 2));
		System.out.println(list.searchArrayListValue(stringlist, "Shazia"));
		//System.out.println("Before sort:");
		//list.displayUsingEnhancedForLoop(stringlist);
		//list.displayUsingForLoop(stringlist);
		//list.displayUsingIterator(stringlist);
		//Collections.sort(stringlist);
		//System.out.println("After sort:");

		//list.displayUsingIterator(stringlist);
		
	}
}
