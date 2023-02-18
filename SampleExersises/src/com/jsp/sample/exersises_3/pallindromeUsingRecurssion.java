package com.jsp.sample.exersises_3;

import java.util.Scanner;

public class pallindromeUsingRecurssion {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scn.nextInt();	
	if(pal(num,0)==num)
	{
		System.out.println("is pallindrome");
	}
	else 
	{
		System.out.println("not pallindrome");
	}
}

public static int pal(int num,int e)
{
	if(num==0)return e;
	e=(e*10)+(num%10);
	return pal(num/10,e);
	}


}
