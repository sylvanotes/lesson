package com.homexu.euler;

public class Problem_3 {
	
	public static boolean isPrime(long n)
	{
		for(long i = 2; i<n; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void PE3(long n)
	{
		for(long i = 2; i<n; i++)
		{
			if(n%i==0 && isPrime(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args)
	{
		PE3(600851475143L);
	}
	
}
