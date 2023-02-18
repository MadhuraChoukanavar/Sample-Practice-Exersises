package com.jsp.sample.exersises_6;

import java.util.Scanner;

public class XylemAndPhloem {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("enter the number");
	String s=scn.next();
	
	int sum1=0;
	int sum2=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		
		if(i==0||i==s.length()-1)
		{
			sum1=sum1+(c-'0');
		
		}
		else
		{
			sum2=sum2+(c-'0');
		}
	}
	System.out.println(sum1);
	System.out.println(sum2);
	
	if(sum1==sum2)
	{
		System.out.println("the number is Xylem ");
	}
	else
	{
		System.out.println("the number is Phloem");
	}
	}
}



