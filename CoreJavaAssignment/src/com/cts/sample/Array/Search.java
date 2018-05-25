package com.cts.sample.Array;

public class Search 
{
	public int linearsearch(int a[],int x)
	{
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			if(a[i]==x)
			{
				return i+1;
			}
		}return -1;
		
	}
	
	public int binarysearch(int a[],int x)
	{
		int size=a.length;
		int lower=0;
		int higher=size-1;
		
		while(lower<higher)
		{
		int middle= (lower+higher)/2;
		
			if(a[middle]==x)
			
				return 1;
			
			else if(x<a[middle])
			
				higher=middle-1;
			
			else
			    
				lower=middle+1;
		}
		return -1;
			
		}
	
		public int binarysearchrec(int arr[], int left, int right, int x)
		{
			if (right>=left)
			{
				int mid = (left + right)/2 ;
				if (arr[mid] == x)
					return mid+1;
 
				if (arr[mid] > x)
					return binarysearchrec(arr, left, mid-1, x);
            		return binarysearchrec(arr, mid+1, right, x);
        }
			
        return -1;
    }
	}
	
