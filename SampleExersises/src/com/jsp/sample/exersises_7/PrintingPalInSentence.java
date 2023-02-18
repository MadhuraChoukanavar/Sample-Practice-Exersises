package com.jsp.sample.exersises_7;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingPalInSentence {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
	    String [] s2=s.split(" ");
	    for(int i=0;i<s2.length;i++)
	    {
	    	if(isPal(s2[i])==true)
	    	{
		System.out.println(s2[i]);
	    	}
	    }
	}
	public static boolean isPal(String s)
	{
		String s1=s.toLowerCase();
		int i=0;
		int j=s1.length()-1;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))return false;
			i++;
			j--;
		}
		
		return true;
		
	}


}
