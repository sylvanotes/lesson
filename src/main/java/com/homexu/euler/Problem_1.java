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
	    // for(int i = n; i<1000; i+=n)
	    // 		res+=i;
	    return res;
	}
	
	public static int sum2(int start, int end, int inc)
	{
		for(int i = 0; i<end; i+=inc)
			start+=i;
		return start;
	}
	
	//Can be eliminated
	public static int findRepeat(int n, int m)
	{
		int x = n*m;
		return sum(x);
	}
	   
	   
	public static void main(String[] args)
	{
		//int s = sum(3) + sum(5) - sum(3*5);
		int s = sum(3) + sum(5) - findRepeat(3,5);
		System.out.println(s);
		
		int s1 = sum2(0, 1000, 3) + sum2(0, 1000, 5) - sum2(0, 1000, 15);
		System.out.println(s1);
	}
}
