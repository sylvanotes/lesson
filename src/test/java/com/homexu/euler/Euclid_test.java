package com.homexu.euler;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Euclid_test {

	@Test
	public void test_one2()
	{
		int x = Euclid.gcd(2, 1);
		assertThat(x, equalTo(1));
	}
	
	@Test
	public void test_six8()
	{
		int x = Euclid.gcd(8, 6);
		assertThat(x, equalTo(2));
	}
	
	@Test
	public void test_two1()
	{
		int x = Euclid.gcd(2, 1);
		assertThat(x, equalTo(1));
	}
	
	@Test
	public void test_oneotwo68()
	{
		int x = Euclid.gcd(102, 68);
		assertThat(x, equalTo(34));
	}
	
	@Test
	public void test_sixtyeight102()
	{
		int x = Euclid.gcd(68, 102);
		assertThat(x, equalTo(34));
	}
	
	@Test
	public void test_same()
	{
		int x = Euclid.gcd(43, 43);
		assertThat(x, equalTo(43));
	}
}
