package com.jsp.sample.exersises_6;

import java.util.SortedSet;
import java.util.TreeSet;
//print all char but not repeated

public class CountNumCharSplCharUsingSet {
public static void main(String[] args) {
String s="AaAbAcDdD1@001";
	
//	char[] a=s.toCharArray();
	int SmallChars=0;
	int nums=0;
	int capChars=0;
	int splChars=0;
	SortedSet s1=new TreeSet();
	SortedSet s2=new TreeSet();
	SortedSet s3=new TreeSet();
	SortedSet s4=new TreeSet();
	
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	if(c>='A'&&c<='Z')
	{
		 capChars++;
		 s1.add(c);
		 
		 
	}
	else if(c>='a'&&c<='z')
	{
		SmallChars++;	
		 s2.add(c);
	}
	else if(c>='0'&&c<='9')
	{
		nums++;	
		s3.add(c);
		 
	}
	else
	{
		splChars++;
		s4.add(c);
		 
	}
	}
	System.out.println(" num of cap letters "+ capChars  + "             the letters are " + s1);
	System.out.println(" num of small letters "+ SmallChars + "           the letters are " +s2);
	System.out.println(" num of digits "+ nums +"                         the numbers are " +s3);
	System.out.println(" num of special chars "+ splChars +"                 the special chars are " +s4);
	
}
}
