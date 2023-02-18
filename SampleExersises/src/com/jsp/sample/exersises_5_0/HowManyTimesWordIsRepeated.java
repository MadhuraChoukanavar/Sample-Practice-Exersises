package com.jsp.sample.exersises_5_0;

public class HowManyTimesWordIsRepeated {

	public static void main(String[] args) {
		String s1="java is opp java is easy";
		int n=s1.length();
		int i=0;
		int count=0;
		while(i<n)
		{
			if(s1.charAt(i)=='j'&& s1.charAt(i+1)=='a' && s1.charAt(i+2)=='v' && s1.charAt(i+3)=='a')
			{
				count++;
				i= i+4;
			}
			else {
				i++;
			}
			
		}
		System.out.println( "java is repeated for  "+count+" times");
	}

}
