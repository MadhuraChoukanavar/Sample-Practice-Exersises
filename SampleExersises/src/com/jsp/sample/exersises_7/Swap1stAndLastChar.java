package com.jsp.sample.exersises_7;

import java.util.Scanner;

// swap only 1st and last char
public class Swap1stAndLastChar
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(swap(s));
	}
   public static String swap(String s)
   { 
	   char [] a=s.toLowerCase().toCharArray();
	   int i=0;
	   int j=a.length-1;
	   while(i<j) 
	   {
	   while(i==0&&j==a.length-1)
	   {   
	    char temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    i++;
	    j++;
	    }
      a[i]=a[i];
       i++;
  }
		return new String(a);
	   
	   }

}
