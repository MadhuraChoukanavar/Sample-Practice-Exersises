package com.jsp.sample.exersises_3;

import java.util.Scanner;

public class StrongNumUsingRecurssion {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the range");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		for(int i=num1;i<=num2;i++)
		{
		if(strong(i)==i)
		{
			System.out.println(i);
		}
		}
	
		
	}
	public static int strong(int num)
	{
	
		if(num==0)return 0;
		return fact(num%10)+strong(num/10);
	}
	public static int fact(int num)
	{
		if(num==0||num==1)return 1;
		return num*fact(num-1);
	}
}
