package com.homexu.euler;


public class ArraySort {
	
	public static void display(int[] newArray)
	{
		System.out.print("(");
		for(int i = 0; i<newArray.length-1; i++)
			System.out.print(newArray[i] + ", ");
		System.out.print(newArray[newArray.length-1] + ")");
	}
	
	public static void sort(int[] input)
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
		display(input);
	}
	
	public static void main(String[] args)
	{
		int[] x = {7, 3, 1, 2};
		sort(x);
	}
	
}
