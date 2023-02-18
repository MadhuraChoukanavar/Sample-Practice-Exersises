package com.jsp.exersisess;

public class primeNumMethod 
{
	
	static boolean m1(int num)
	{
		if(num<1)return false;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)return false;}
		return false;
}
  public static void main(String[] args) {
	  int a=1;
	  int b=100;
	for (int i=a;i<=b;i++)
	{
		if(m1(i))
			System.out.println(i);
	}
}
}
