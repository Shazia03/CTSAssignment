package com.cts.Array;

public class SortingArray 
{
	public void bubbleSort(int arr[])
	{
		int n=arr.length;
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		
		//NO SOP here?
		for(int k=0;k<n;k++)
		System.out.println(arr[k]);
    }
	
	
	
		
	}