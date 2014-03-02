package com.homexu.euler;

public class MergeSort {
	
/*	public static void mSort(int[] input)
	{
		int size = 1;

			for(int i = 0; i<input.length-1; i+=(2*size))
			{
				if(input[i+1] < input[i])
				{
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}

	}*/
	
	public static void sortArray(int[] input)
	{
		int[] temp = new int[input.length];
		int first = 0;
		int half = input.length/2;
		int second = half;
		
		for(int x = 0; x<temp.length; x++){
			if(input[first]<input[second]){
				temp[x] = input[first];
				first++;
			}
			
			else
			{
				temp[x] = input[second];
				second++;
			}
			
			if(first==half||second==input.length)
				break;
		}
		
		for(int x = first+(second-half); x<temp.length; x++){
			if(first<half)
			{
				temp[x] = input[first];
				first++;
			}
			
			else
			{
				temp[x]=input[second];
				second++;
			}
		}
		
		for(int i = 0; i<temp.length; i++)
			input[i] = temp[i];
	}
	
	public static String display(int[] newArray)
	{
		String dis = "(";
		for(int i = 0; i<newArray.length-1; i++)
			dis += (newArray[i] + ", ");
		return (dis + newArray[newArray.length-1] + ")");
	}

}
