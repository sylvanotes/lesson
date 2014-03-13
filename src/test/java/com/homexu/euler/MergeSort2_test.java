package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MergeSort2_test {
	
	@Test
	public void test_startInMiddle()
	{
		int[] toSort = {2, 3, 4, 1, 1, 3, 4, 8, 9, 2, 2, 5, 6, 7, 13, 23, 89};
		MergeSort2.sortArray(toSort, 4, 14);
		String x = MergeSort2.display(toSort);
		assertThat(x, equalTo("(2, 3, 4, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 13, 23, 89)"));
	}
	
	@Test
	public void test_orderAgain()
	{
		int[] toSort = {2, 3, 5, 7, 1, 1, 3, 4};
		MergeSort2.sortArray(toSort, 0, 8);
		String x = MergeSort2.display(toSort);
		assertThat(x, equalTo("(1, 1, 2, 3, 3, 4, 5, 7)"));
	}
	
	@Test
	public void test_withTwo()
	{
		int[] toSort = {4, 3};
		MergeSort2.sortArray(toSort, 0, 2);
		String x = MergeSort2.display(toSort);
		assertThat(x, equalTo("(3, 4)"));
	}
	
	@Test
	public void test_sortEntireArray()
	{
		int[] toSort = {4, 8, 5, 2, 7, 1, 6, 9, 0, 11, 3};
		MergeSort.sortArray(toSort, 0, toSort.length);
		String x = MergeSort.display(toSort);
		assertThat(x, equalTo("(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11)"));
	}
}
