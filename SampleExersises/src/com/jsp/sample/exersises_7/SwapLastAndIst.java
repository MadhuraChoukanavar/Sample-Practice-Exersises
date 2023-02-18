package com.jsp.sample.exersises_7;

import java.util.Scanner;

public class SwapLastAndIst {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(swap(s));
		
	}
	public static String swap(String s) {
		char c=s.charAt(0);
	String s1=	s.replace(s.charAt(0),s.charAt(s.length()-1));
	 s1=s.replace(s.charAt(s.length()-1), c);
	 return new String(s1);
		
	}

}
