package com.jsp.sample.exersises_4;

import java.util.Scanner;

public class PrintNextVowel {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next();
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c<'a')
		{
			System.out.println('a');
		}
		else if(c<'e')
		{
			System.out.println('e');
		}
		else if(c<'i')
		{
			System.out.println('i');
		}
		else if(c<'o')
		{
			System.out.println('o');
		}
		else if(c<'u')
		{
			System.out.println('u');
		}
		else
		{
			System.out.println("no vowel found");
		}
		}
		}

}
