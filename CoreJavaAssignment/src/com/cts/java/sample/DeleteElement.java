package com.cts.java.sample;

import java.util.Arrays;

public class DeleteElement
{
    public String deleteElementpos(int arr[],int pos,int insert)
    {
       int size=arr.length;
       int i;
       size++;
        for(i=pos-1; i>size-1; i--)
       {
           arr[i] = arr[i-1];
       }
	   
       arr[pos] = insert;
	   
	   return Arrays.toString(arr);
   }
    public String deleteElement(String arr[])
    {
    	arr[1]=arr[arr.length-1];
  
    	return Arrays.toString(arr);
    }
}
