package com.jsp.sample.exersises_2;

import java.util.Scanner;

public class BigPalindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		String bigPal="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(isPal(s,i,j))
				{
					String temp=s.substring(i,j+1);
					if(temp.length()>=bigPal.length())
					{
						bigPal=temp;
					}
				}
				
			}
		}
		System.out.println(bigPal);

	}
	public static boolean isPal(String s,int start,int end)
	{
		char[] a=s.toLowerCase().toCharArray();
		int i=start;
		int j=end;
		 while(i<j)
		 {
			 if(a[i]!=a[j])return false;
			 i++;
			 j--;
		 }
		 return true;
	}

}
