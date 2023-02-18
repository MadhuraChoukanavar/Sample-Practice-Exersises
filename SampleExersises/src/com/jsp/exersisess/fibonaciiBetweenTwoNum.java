package com.jsp.exersisess;

import java.util.Scanner;

public class fibonaciiBetweenTwoNum {

	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the number");
	int x=scn.nextInt();
	int y=scn.nextInt();
	int a=0,b=1,c;
	
	while(a<=y)
	{
		
		if(a>=x)
		{
			System.out.println(a);
		}
			c=a+b;
			a=b;
			b=c;
	}
	}

}
