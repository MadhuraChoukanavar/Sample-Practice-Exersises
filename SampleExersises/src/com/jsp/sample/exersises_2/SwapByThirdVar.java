package com.jsp.sample.exersises_2;

import java.util.Scanner;

public class SwapByThirdVar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int num3;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println(num1);
		System.out.println(num2);
		

	}

}
