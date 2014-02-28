package com.homexu.euler;

public class MergeSort {
	
	public static void mSort(int[] input)
	{
		int size = 1;
		if(input.length%2==0)
		{
			for(int i = 0; i<input.length; i+= (2*size))
			{
				if(input[i+1] < input[i])
				{
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
		
		if(input.length%2==1)
		{
			for(int i = 0; i<input.length-1; i+=(2*size))
			{
				if(input[i+1] < input[i])
				{
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}

	}
	
	public static String display(int[] newArray)
	{
		String dis = "(";
		for(int i = 0; i<newArray.length-1; i++)
			dis += (newArray[i] + ", ");
		return (dis + newArray[newArray.length-1] + ")");
	}

}
