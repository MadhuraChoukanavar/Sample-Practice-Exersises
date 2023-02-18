package com.jsp.exersisess;
import java.util.Scanner;
public class pattern
{
	public static void main(String[] args) 
	{
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the num");
	int num=scn.nextInt();
	for(int i=1;i<=num;i++)
	{
	   for(int j=1;j<=num-i;j++)	
	   {
		 System.out.print(" ");  
	   }
	   for(int j=1;j<2*i-1;j++)
	   {
		   System.out.print("*");
	   }
	   
	   System.out.println("");
	
	}
	
	}
	
	
}
