package com.homexu.euler;

public class Euclid {
	
	public static int gcd(int p, int q)
	{
		return p%q==0 ? q : gcd(q, p%q);
	}

}
