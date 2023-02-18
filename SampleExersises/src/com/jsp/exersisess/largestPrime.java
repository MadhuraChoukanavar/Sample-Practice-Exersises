package com.jsp.exersisess;

import java.util.Scanner;

public class largestPrime {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter numbers");
		int x=scn.nextInt();
		
		
		
		for(int i=x;i<=x;i--)
		{
			if(i<=1)return;
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(i);
			return;
			
			
		}
	}

}
