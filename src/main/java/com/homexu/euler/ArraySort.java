package com.homexu.euler;


public class ArraySort {
	
	public static String display(int[] newArray)
	{
		String dis = "(";
		for(int i = 0; i<newArray.length-1; i++)
			dis += (newArray[i] + ", ");
		return (dis + newArray[newArray.length-1] + ")");
	}
	
	public static String sort(int[] input)
	{
		for(int outer = 0; outer < input.length; outer++)
		{
			for(int inner = 0; inner < input.length -1; inner++)
			{
				if(input[inner]> input[inner+1])
				{
					int temp = input[inner];
					input[inner] = input[inner+1];
					input[inner+1] = temp;
				}
			}
		}
		return (display(input));
	}
	
	public static void main(String[] args)
	{
		int[] x = {8, 2, 4, 19, 93, 1, 283, 18, 7, 5, 11};
		System.out.print(sort(x));
	}
	
}
