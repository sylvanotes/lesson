package com.homexu.euler;

public class Euclid {
	
	public static int gcd(int p, int q)
	{
		
		if(p%q==0)
			return q;
		else
			return gcd(q, p%q);
	}

}
