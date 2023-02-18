package com.jsp.sample.exersises_7;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingPalInSentence {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the string");
	String s=scn.nextLine();
	System.out.println(allPalInString(s));
}

public static ArrayList allPalInString(String s)
{
	ArrayList<String> list=new ArrayList<String>();

	String [] a=s.split(" ");   
	for(int i=0;i<a.length;i++)
	{
		
		String s2=" ";
		 s2=a[i];
		if(isPal(s2.toLowerCase()))
		{
			list.add(s2);
			
		}
	}
	return list;
 }
public static boolean isPal(String s)
{
	
	int i=0;
	int j=s.length()-1;
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j))return false;
		i++;
		j--;
	}
	
	return true;
	
}

}
