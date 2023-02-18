package com.jsp.sample.exersises_3;

public class OneToTenUsingRecurssion {

	public static void main(String[] args) {
		display(1);

	}
	
	public static void display(int n)
	{
		if(n>10)return;
		System.out.println(n);
		display(n+1);
	}

}
