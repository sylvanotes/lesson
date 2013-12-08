package com.homexu.euler;
public class Problem_439 {
	
	public static int sumMult(int n)
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
		return sumMult(x);
	}
	
	public static int sumDiv(int n)
	{
		int res = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i==0)
				res+=i;
		}
		return res;
	}
	
	public static int sumSumDiv(int n)
	{
		int res = 0;
		for(int i = 1; i<=n; i++)
		{
			for(int k=1; k<=n; k++)
				res+=sumDiv(i*k);
		}
		return res;
	}
	
	
	public static void main(String[] args)
	{
		//int s = sumMult(3) + sumMult(5) - sumMult(3*5);
		//System.out.println(s);

		int s1 = sumSumDiv(10);
		System.out.println(s1);
	}

}
