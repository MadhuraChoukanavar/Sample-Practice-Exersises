package com.jsp.sample.exersises_2;

import java.util.Scanner;

public class LcmOfNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		int num=a>b?a:b;
		while(true)
		{
			if(num%a==0&&num%b==0)break;
			num++;
		}
		System.out.println(num);

	}

}
