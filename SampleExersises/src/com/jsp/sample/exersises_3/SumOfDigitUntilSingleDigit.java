package com.jsp.sample.exersises_3;

public class SumOfDigitUntilSingleDigit {

	public static void main(String[] args) {
		sumOfNum(1235);
		if(sumOfNum(1235)>9)
		{
		System.out.println(sumOfNum(sumOfNum(1235)));
		}

	}
	public static int sumOfNum(int n)
	{
		if(n==0)return 0;
		return  n%10+sumOfNum(n/10); 
		
	}
	
}
