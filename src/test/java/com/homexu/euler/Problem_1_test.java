package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Problem_1_test {

	@Test
	public void test() {
		int blah = Problem_1.sum2(1, 11, 1);
		assertThat(blah, equalTo(55));
	}
	
	public void test2()
	{
		int blah2 = Problem_1.sum2(2, 17, 3);
		assertThat(blah2, equalTo(47));
	}

}
