package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ArrayFormat_test {
	
	@Test
	public void test() {
		int[] a = {13, 2, 4, 15, 8, 19};
		String x = ArrayFormat.display(a);
		assertThat(x, equalTo("(13, 2, 4, 15, 8, 19)"));
	}
}