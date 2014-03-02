package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


public class MergeSort_test {
	/*@Test
	
	public void test_Random()
	{
		int[] toSort = {4, 8, 5, 2, 7, 1, 6, 9, 0, 11, 3};
		MergeSort.sortArray(toSort);
		String x = MergeSort.display(toSort);
		assertThat(x, equalTo("(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11)"));
	}*/
	
	@Test
	public void test_endsAtBoundary()
	{
		int[] toSort = {7, 8, 9, 1, 2, 3, 4};
		MergeSort.sortArray(toSort);;
		String x = MergeSort.display(toSort);
		assertThat(x, equalTo("(1, 2, 3, 4, 7, 8, 9)"));
	}
	
	@Test
	public void test_doesNotEndAtBoundary()
	{
		int[] toSort = {1, 3, 4, 8, 9, 2, 2, 5, 6, 7};
		MergeSort.sortArray(toSort);
		String x = MergeSort.display(toSort);
		assertThat(x, equalTo("(1, 2, 2, 3, 4, 5, 6, 7, 8, 9)"));
	}
	
}
