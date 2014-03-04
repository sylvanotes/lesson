package com.homexu.euler;

public class BinarySearch {
	
	public static int search(int lookFor, int[] input)
	{
		return search(lookFor, input, 0, input.length);
	}
	
	public static int search(int lookFor, int[] input, int start, int end)
	{
		if(end-start==1)
			return input[start]==lookFor ? start: -1; //tenary
		
		int half = (end+start)/2;
		
		boolean isLeft = lookFor<input[half];
		
		return isLeft? search(lookFor, input, start, half): search(lookFor, input, half, end);
		
/*		if(isLeft){
			return search(lookFor, input, start, half);
		}
		
		else{
			return search(lookFor, input, half, end);
		}
		
		
		if(end-start==1){
			if(input[start]==lookFor)
				return start;
			else
				return -1;*/
		
	}
}
