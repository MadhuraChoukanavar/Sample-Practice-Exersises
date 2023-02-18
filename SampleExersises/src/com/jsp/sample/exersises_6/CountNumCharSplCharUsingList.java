package com.jsp.sample.exersises_6;

import java.util.LinkedList;

public class CountNumCharSplCharUsingList {
	public static void main(String[] args) {
		String s="AaAbAcDdD1@001";
			
//			char[] a=s.toCharArray();
			int SmallChars=0;
			int nums=0;
			int capChars=0;
			int splChars=0;
			LinkedList l1=new LinkedList();
			LinkedList l2=new LinkedList();
			LinkedList l3=new LinkedList();
			LinkedList l4=new LinkedList();
			
			
			
			for(int i=0;i<s.length();i++)
			{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z')
			{
				 capChars++;
				 l1.add(c);
				 
				 
			}
			else if(c>='a'&&c<='z')
			{
				SmallChars++;	
				 l2.add(c);
			}
			else if(c>='0'&&c<='9')
			{
				nums++;	
				l3.add(c);
				 
			}
			else
			{
				splChars++;
				l4.add(c);
				 
			}
			}
			System.out.println(" num of cap letters "+ capChars  + "             the letters are " + l1);
			System.out.println(" num of small letters "+ SmallChars + "           the letters are " +l2);
			System.out.println(" num of digits "+ nums +"                         the numbers are " +l3);
			System.out.println(" num of special chars "+ splChars +"                 the special chars are " +l4);
			
		}
}
