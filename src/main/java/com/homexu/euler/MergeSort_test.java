package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


public class MergeSort_test {
	@Test
	
	public void test()
	{
		int[] toSort = {4, 8, 5, 2, 7, 1, 6, 9, 0, 11, 3};
		MergeSort.mSort(toSort);
		String x = MergeSort.display(toSort);
		assertThat(x, equalTo("(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11)"));
	}
	
}
