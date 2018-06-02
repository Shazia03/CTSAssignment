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
    public String deleteElement(String str,int del)
    {
       	char[] character=str.toCharArray();
    	for(int i=0; i<character.length-1; i++)
        {
            character[i] = character[i+1];
              
        }
    	character[character.length-1]='\0';
    	
    	String chara=new String(character);
		return chara;
    }
}
