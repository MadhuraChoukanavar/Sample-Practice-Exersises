package com.jsp.sample.exersises_5;

import java.util.Scanner;

public class AutoMorphicNum {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		int n=num;
	int	count=0;
		while(n>0)
		{
			count ++;
			n=n/10;
		}
		int prod=num*num;
		while(num>0&&prod>0)
		{
			if( (num>0&&prod>0)&&num%10==prod%10)
			{
				num=num/10;
				prod=prod/10;
			}
			
			
		}
		
		
		
		
		
	}

}
