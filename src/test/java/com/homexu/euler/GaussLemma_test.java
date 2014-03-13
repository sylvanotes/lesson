package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class GaussLemma_test {

	@Test
	public void test_sum4()
	{
		int x = GaussLemma.sum(0, 0, 4);
		assertThat(x, equalTo(10));
	}
	
	@Test
	public void test_sum2()
	{
		int x = GaussLemma.sum(0, 0, 2);
		assertThat(x, equalTo(3));
	}
	
	@Test
	public void test_sum1()
	{
		int x = GaussLemma.sum(0, 0, 1);
		assertThat(x, equalTo(1));
	}
	
	@Test
	public void test_actualSum4()
	{
		int x = GaussLemma.sum(4);
		assertThat(x, equalTo(10));
	}
	
}
