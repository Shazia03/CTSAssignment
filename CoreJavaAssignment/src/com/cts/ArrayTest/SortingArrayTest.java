package com.cts.ArrayTest;
import java.util.Arrays;

import com.cts.Array.SortingArray;
public class SortingArrayTest
{
	public static void main(String agrs[])
	{
		int[] num= {33,67,89,21,34,55,11};
		SortingArray sa=new SortingArray();
		System.out.println(Arrays.toString(sa.bubbleSort(num)));
	}

}
