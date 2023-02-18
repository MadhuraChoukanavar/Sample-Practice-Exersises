package com.jsp.sample.exersises_2;

import java.util.Scanner;

public class PalindromeInRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter thye range");
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		for(int i=x;i<=y;i++)
		{
			if(isPal(i))
			{
				System.out.println(i);
			}
		}

	}
public static boolean  isPal(int num)
{
	int n=num;
	int rev=0;
	while(num>0)
	{
		int d=num%10;
		rev=d+rev*10;
		num=num/10;
	}
	if(n==rev)
	{
		return true;
	}
	else
	{
		return false;
		
	}
	
}
	
	
}
