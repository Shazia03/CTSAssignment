package com.cts.Array;

public class DeleteElement
{
	//deleting or inserting??
    public int[] Insertion(int arr[],int pos,int insert)
    {
       int size=arr.length;
       int i;
	    //why size++ and size-1 ??
        for(i=pos-1; i>size; i--)
       {
           arr[i] = arr[i-1];
       }
	   
       arr[pos] = insert;
	   //why to convert into string?
	   return arr;
   }
	//what you are deleting?
    public String[] deleteElement(String arr[],String del)
    {
    	for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == del)
            {
                for(int j=i; j<arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
            }
        }
		return arr;
    }
}
