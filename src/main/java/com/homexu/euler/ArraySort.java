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
		int min = 0;
		for(int i = 0; i<input.length; i++)
		{
			for(int j = i; j<input.length; j++)
			{
				if(input[j]>=min)
				{
					input[i]=input[j];
					min = input[j];
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
