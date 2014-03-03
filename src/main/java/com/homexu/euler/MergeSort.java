package com.homexu.euler;

public class MergeSort {
	
	public static void sortArray(int[] input) {
		sortArray(input, 0, input.length);
	}
	
	public static void sortArray(int[] input, int start, int end){
		new MergeSort(input).sortArray(start, end);
	}
	
	private final int[] input;
	private final int[] temp;
	private MergeSort(int[] input) {
		this.input = input;
		temp = new int[input.length];
	}
	
	private void sortArray(int start, int end){
		if (end-start == 1) return;

		int half = (start + end)/2;

		sortArray(start, half);
		sortArray(half, end);
		
		int first = start;
		int second = half;
		for(int x = 0; x<end-start && first < half && second < end; x++){
			temp[x] = (input[first]<input[second]) ? input[first++] : input[second++];			
		}
		
		boolean isLeft = first<half;
		for(int x = (first-start)+(second-half); x<end-start; x++){
				temp[x] = isLeft ? input[first++] : input[second++];
		}
		
		for(int i =0, j = start; i<(end-start); j++, i++){
			input[j] = temp[i];
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
