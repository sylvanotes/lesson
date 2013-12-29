package com.homexu.euler;

public class Problem_2 {
	
	public Problem_2()
	{
		
	}
	
	public static int PE2(int n)
	{
		int a = 0;
		int b = 1;
		int c = 1;
		int sum = 0;
		
		while((a+b)<n)
		{
			c=a+b;
			b=a;
			a=c;
			
			if(c%2==0)
				sum+=c;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(PE2(15));
	}

}
