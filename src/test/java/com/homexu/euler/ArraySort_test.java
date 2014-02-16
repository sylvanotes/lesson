package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ArraySort_test {

	@Test
	
	public void test()
	{
		int[] a = {18, 2, 37, 7, 13, 9};
		String x = ArraySort.sort(a);
		assertThat(x, equalTo("(2, 7, 9, 13, 18, 37)"));
	}
	
}
