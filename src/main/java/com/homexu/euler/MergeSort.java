package com.homexu.euler;

public class MergeSort {
	
	public static void sortArray(int[] input, int start, int end){
		int[] temp = new int[end-start];
		int first = start;
		int half = start + (end-start)/2;
		int second = half;
	
		if (end-start == 1) return;
		
		sortArray(input, start, half);
		sortArray(input, half, end);
		
		for(int x = 0; x<temp.length; x++){
			if(input[first]<input[second]){
				temp[x] = input[first];
				first++;
			}
			
			else {
				temp[x] = input[second];
				second++;
			}
			
			if(first==half||second==end)
				break;
		}
		
		boolean isLeft = first<half;
		for(int x = (first-start)+(second-half); x<temp.length; x++){
			if(isLeft){
				temp[x] = input[first];
				first++;
			}
			
			else {
				temp[x]=input[second];
				second++;
			}
		}
		
		int i = 0;
		for(int j = start; i<(end-start); j++){
			input[j] = temp[i];
			i++;
		}
	}
	
	public static void sortEntire(int[] input){
		int size = 2;

		for(int i = 0; i<input.length; i+= size){
			sortArray(input, i, i+size-1);
			//size*=2;
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
