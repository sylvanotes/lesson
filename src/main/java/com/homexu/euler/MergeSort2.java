package com.homexu.euler;

public class MergeSort2 {
	
	public static void sortArray(int[] input, int start, int end)
	{
		int half = (end+start)/2;
		int firstHalf = start;
		int secondHalf = half;
		
		if((end-start)==1)
			return;
		
		sortArray(input, start, half);
		sortArray(input, half, end);
		
		int[] temp = new int[end-start];

			for(int x = 0; x<temp.length; x++)
			{
				if(firstHalf<half && secondHalf<end)
				{
					if(input[firstHalf]<input[secondHalf])
					{
						temp[x] = input[firstHalf];
						firstHalf++;
					}
					else
					{
						temp[x] = input[secondHalf];
						secondHalf++;
					}
				}
				else
				{
					break;
				}
			}
		
			for(int x = (secondHalf-half) + (firstHalf-start); x<temp.length; x++)
			{
				if(firstHalf==half)
				{
					temp[x]=input[secondHalf];
					secondHalf++;
				}
				else
				{
					temp[x]=input[firstHalf];
					firstHalf++;
				}
			}
		
		int j = 0;
		for(int i = start; i<end; i++)
		{
			input[i] = temp[j];
			j++;
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
