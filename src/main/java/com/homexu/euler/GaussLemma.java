package com.homexu.euler;

public class GaussLemma {
	
	public static int sum(int total, int addend, int n)
	{
		total+=addend;
		addend++;
		
		if(addend<=n)
			return sum(total, addend++, n);
		else
			return total;
	}
	
	public static int sum(int n)
	{
		return sum(0, 0, n);
	}
	
}
