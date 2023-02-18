package com.jsp.sample.exersises_3;

import java.util.Scanner;

public class AmStrongUsingRecurssion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the range");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			if(isAmstrong(i,lenOf(i))==i)
			{
				System.out.println(i);
			}
		}
	}
	public static int isAmstrong(int num,int len)
	{
		if(num==0)return 0;
		return power(num%10,len)+isAmstrong(num/10,len);
	}
	public static int lenOf(int num)
	{   if(num==0)return 0;
		return 1+lenOf(num/10);
	}
	public static int power(int b,int e)
	{
		if(e==0)return 1;
		if(e==1)return b;
		
		return b*power(b,e-1);
	}

}
