package com.jsp.exersisess;

import java.util.Scanner;

public class sumOfEvenOdd {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int num=n;
		int sOdd=0;
		int sEven=0;
		
		while(num>0)
		{
			int d=num%10;
			if(d%2==0) {
				sEven+=d;
			}
			else {
				sOdd+=d;
			}
				
			num=num/10;
		}
		System.out.println("sum of even num"+sEven);
		System.out.println("sum of odd num"+sOdd);
	}

}
