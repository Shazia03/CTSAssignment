package com.cts.Array;

import java.util.Arrays;

public class DeleteElement
{
	//deleting or inserting??
    public String deleteElementpos(int arr[],int pos,int insert)
    {
       int size=arr.length;
       int i;
       size++;
	    //why size++ and size-1 ??
        for(i=pos-1; i>size-1; i--)
       {
           arr[i] = arr[i-1];
       }
	   
       arr[pos] = insert;
	   //why to convert into string?
	   return Arrays.toString(arr);
   }
	//what you are deleting?
    public String deleteElement(String arr[])
    {
    	arr[1]=arr[arr.length-1];
  
    	return Arrays.toString(arr);
    }
}
