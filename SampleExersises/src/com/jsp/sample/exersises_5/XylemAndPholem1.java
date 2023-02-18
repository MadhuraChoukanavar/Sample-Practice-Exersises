package com.jsp.sample.exersises_5;

import java.util.Scanner;

public class XylemAndPholem1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println(" enter the number");
		int n=scn.nextInt();
		int last=n%10;
		n=n/10;
		int mid=0;
		while(n>=9)
		{
		  mid =mid+n%10;
		  n=n/10;
		}
		int first=n;
		int sum=last+first;
		if(sum==mid) {
			System.out.println("the number is Xylem ");
			}
		else
		{
			System.out.println("the number is Phloem");
		}
	
	}
}
