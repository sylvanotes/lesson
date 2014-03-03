package com.homexu.euler;

public class BinarySearch {
	
	public static int search(int lookFor, int[] input)
	{
		return search(lookFor, input, 0, input.length);
	}
	
	public static int search(int lookFor, int[] input, int start, int end)
	{
		
		int half = start + (end-start)/2;
		
		
		search(lookFor, input, start, end);
		
		boolean isLeft = lookFor<=input[half];
		
		if(isLeft){
			end = half;
			half = start + (end-start)/2;
		}
		
		else
		{
			start = half+1;
			half = start + (end-start)/2;
		}
		
		if(end-start==1){
			if(input[start]==1)
				return start;
			else
				return end;
		}
		
		else
			return -1;
	}
}
