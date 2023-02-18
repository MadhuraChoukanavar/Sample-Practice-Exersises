package com.jsp.exersisess;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the number");
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		int gcd=0;
		for(int i=1;i<x||i<=y;i++)
		{
			
			if(x%i==0&&y%i==0)
				gcd=i;
		}
		System.out.println(gcd);
		
	}

}
