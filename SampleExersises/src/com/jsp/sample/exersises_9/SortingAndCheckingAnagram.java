package com.jsp.sample.exersises_9;

import java.util.Arrays;

public class SortingAndCheckingAnagram {
	public static void main(String[] args) {
		
	
	String s1="silentt";
	String s2="listenn";
	char[] a=s1.toCharArray();
	char[] a1=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(a1);
	String s3=new String (a);
	String s4=new String (a1);
	System.out.println(s3.equals(s4));
	}
}
