package com.cts.ArrayTest;

import com.cts.Array.QuickSort;

public class QuickSortTest {

public static void main(String[] args) 
{
	int arr[] = {10, 7, 8, 9, 1, 5};
    int n = arr.length;

    QuickSort ob = new QuickSort();
    System.out.println(ob.sort(arr, 0, n-1));
    

}

}
