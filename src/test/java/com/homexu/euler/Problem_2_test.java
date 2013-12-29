package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Problem_2_test {
	
	@Test
	public void test()
	{
		int x = Problem_2.PE2(15);
		assertThat(x, equalTo(10));
	}
	
	public void test2()
	{
		int x1 = Problem_2.PE2(40);
		assertThat(x1, equalTo(44));
	}

}
