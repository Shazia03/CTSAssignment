package com.cts.java.sampletest;

import com.cts.java.sample.MergeSort;

public class MergeSortTest {

	public static void main(String[] args) 
	{
		 int arr[] = {12, 11, 13, 5, 6, 7};
		 MergeSort ob = new MergeSort();
	    System.out.println( ob.sort(arr, 0, arr.length-1));
	}

}
