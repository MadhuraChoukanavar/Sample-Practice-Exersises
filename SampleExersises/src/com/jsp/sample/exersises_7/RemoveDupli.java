package com.jsp.sample.exersises_7;

import java.util.Scanner;

public class RemoveDupli
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner (System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		System.out.println(removeDupli(s));
	}
	public static String removeDupli(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.toLowerCase().charAt(i);
			if(s1.indexOf(c)==-1||c==' ')s1=s1+c;
		
		}
		return new String (s1);
	}
}


