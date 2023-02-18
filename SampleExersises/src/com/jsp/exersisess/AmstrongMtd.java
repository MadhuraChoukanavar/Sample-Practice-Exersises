package com.jsp.exersisess;

public class AmstrongMtd
{
	public static int len(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static int pow(int b , int p)
	{
		int prod=1;
		for(int i=1;i<=p;i++)
		{
			prod=prod*b;
		}
		return prod;
	}
	public static boolean AmStrong(int n)
	{ int num=n;
		int sum=0;
	   int p=len(n);
	   while(n>0)
	   {
		  sum=sum+pow(n%10,p) ;
		  n=n/10;
	   }
	   return sum==num;
	}
	
	
	
	

	public static void main(String[] args)
	{
	for(int i=1;i<=500;i++)
	{
		if(AmStrong(i))
			System.out.println(i);
	}

	}

}
