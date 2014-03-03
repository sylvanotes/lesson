package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class BinarySearch_test {
	
	int[] a = {2, 3, 4, 5, 6, 7, 8};
	int[] b = {23, 28, 35, 39, 41, 44, 57, 66};
	int[] c = {5, 7};
	
	@Test
	public void test_inMiddle()
	{
		int lookFor = 5;
		int x = BinarySearch.search(5, a);
		assertThat(x, equalTo(3));
	}
}
