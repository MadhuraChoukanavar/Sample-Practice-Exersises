package com.jsp.exersisess;

import java.util.Scanner;
public class StrongNum {
	public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
    System.out.println("enter the range");
		int a=scn.nextInt();
		int b=scn.nextInt();
	    do
		{
	    	int sum=0;
	    int n=a;
		while(n>0)
		{
			
			int fact=1;
			int d=n%10;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		    n=n/10;
		    }
		 if (a==sum)
			System.out.println(a);
		    a++;
		}
	   while(a<b);
		
	}

}
