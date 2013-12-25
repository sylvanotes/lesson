package com.homexu.euler;

public class Problem_2 {
	
	public static void PE2()
	{
		int a = 0;
		int b = 1;
		int c = 1;
		int sum = 0;
		
		while(b<4000000)
		{
			c=a+b;
			if(c%2==0)
				//System.out.print(c + " ");
				sum+=c;
			
			a=b+c;
			if(a%2==0)
				//System.out.print(a + " ");
				sum+=a;
			
			b=c+a;
			if(b%2==0)
				//System.out.print(b + " ");
				sum+=b;
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args)
	{
		PE2();
	}

}
