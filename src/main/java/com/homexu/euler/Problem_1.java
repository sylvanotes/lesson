package com.homexu.euler;

public class Problem_1 {   
	
	public static int sum(int n)
	{
	    int res = 0;
	    int mult = 0;
	    while(n*mult<1000){
	        res+=n*mult;
	        mult++;
	    }
	    return res;
	}
	   
	//another way:
	public static int findRepeat(int n, int m)
	{
		int x = n*m;
		return sum(x);
	}
	   
	   
	public static void main(String[] args)
	{
		int s = sum(3) + sum(5) - sum(3*5);
		//int s = sum(3) + sum(5) - findRepeat(3,5);
		System.out.print(s);
	}
}
