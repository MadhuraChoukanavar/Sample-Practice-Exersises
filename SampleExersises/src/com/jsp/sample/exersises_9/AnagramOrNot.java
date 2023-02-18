package com.jsp.sample.exersises_9;
import java.util.Scanner;
public class AnagramOrNot {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		if(isAnagram(s1,s2))System.out.println(" is annagram");
		else {
			System.out.println(" not anagram");
		}
	}
    public static boolean isAnagram(String s1,String s2)
    {
    	if(s1.length()!=s2.length())return false;
    	for(int i=0;i<s1.length();i++)
    	{ 
    		char c=s1.toLowerCase().charAt(i);
    		if(!s2.contains(c+ "" ))return false;
    		
    	}
    	return true;
    	}
}
