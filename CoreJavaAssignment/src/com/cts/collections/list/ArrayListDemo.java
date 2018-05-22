package com.cts.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public boolean searchArrayListValue(List<Integer> list,int integer)
	{
		for(Integer i:list)
		{
			if(i==integer)
				return true;
		}
		return false;
		
	}
	public boolean searchArrayListValue(List<String> list,String str)
	{
		for(String s:list)
		{
			if(s.equals(str))
				return true;
		}
		return false;
		
	}
	public Object searchArrayListPosition(List list,int i)
	{
			return  list.get(i-1);
		
	}
	
	public void displayUsingEnhancedForLoop(List list) 
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
	}
	public void displayUsingForLoop(List list) 
	{
		int s=list.size();
		for(int i=0;i<s;i++)
		{
			System.out.println(list.get(i));
		}
		
	}

	public void displayUsingIterator(List list) 
	{
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
}
		
		
		
