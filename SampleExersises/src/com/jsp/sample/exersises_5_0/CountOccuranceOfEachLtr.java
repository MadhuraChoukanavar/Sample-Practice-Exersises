package com.jsp.sample.exersises_5_0;

import java.util.Scanner;

public class CountOccuranceOfEachLtr {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		String s1=scn.next();		
		//int len=s1.length();		
         while(s1.length()>0)
         {
        	 char c=s1.charAt(0);
        	String s2=s1.replace(c+"" ,"");
      int  count=s1.length()-s2.length();
       	 System.out.println(" Occurance of "+ c + " is "+count);
       	s1=s2; 
        }
         
        
	}

}
