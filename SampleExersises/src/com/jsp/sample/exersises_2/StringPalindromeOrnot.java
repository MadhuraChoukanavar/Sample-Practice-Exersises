package com.jsp.sample.exersises_2;

import java.util.Scanner;

public class StringPalindromeOrnot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scn.nextLine();
		
		if(isPal(s)) {
			System.out.println(s);
		}
	}
	public static boolean isPal(String s)
	{
		char[] a=s.toLowerCase().toCharArray();
		
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			if(a[i]!=a[j])return false;
			i++;
			j--;
		}
		return true;
		
	}

}
