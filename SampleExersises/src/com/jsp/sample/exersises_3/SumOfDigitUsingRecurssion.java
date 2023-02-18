package com.jsp.sample.exersises_3;

public class SumOfDigitUsingRecurssion {

	public static void main(String[] args) {
      
      System.out.println(sumOfNum(1235));

	}
	public static int sumOfNum(int n)
	{
		if(n==0)return 0;
		
	  return n%10+sumOfNum(n/10);
	}

}
