package com.bridgelabz;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		for (int i = 0; i <= 10; i++) 
		{
			System.out.print(i+" is ");
			primeCal(i);	
			
		}
		
	}

	static void primeCal(int num)
	{
		int count = 0;
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("prime number ");
		else
			System.out.println("not a prime number ");
	}

}