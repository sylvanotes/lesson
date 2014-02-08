package com.homexu.euler;

public class ArrayFormat {
	
	public static String display(int[] newArray)
	{
		System.out.print("(");
		for(int i = 0; i<newArray.length-1; i++)
			System.out.print(newArray[i] + ", ");
		return (newArray[newArray.length-1] + ")");
	}
	
	public static void main(String[] args)
	{
		int x[] = {34, 56, 78, 49, 60, 2, 38, 10};
		System.out.print(display(x));
	}
	
}
