package com.cts.sample.ArrayTest;

import com.cts.sample.Array.Search;

public class SearchTest {

	public static void main(String[] args)
	{
		Search sc=new Search();
		int[] num= {1,4,12,15,50};
		int n=num.length;
		System.out.println("Linear search: "+sc.linearsearch(num,15));
		System.out.println("Binary search: "+sc.binarysearch(num,15));
		System.out.println("Binary rec search: "+sc.binarysearchrec(num,0,n-1,50));
		
		
	}

}
