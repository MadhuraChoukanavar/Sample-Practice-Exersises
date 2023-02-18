package com.jsp.exersisess;

public class methodpractice {

	
		static int m1() {
		System.out.println("m1 is executed");
		return 10;
	}	
	
	public static void main(String[] args) {
		m1();
		int i=m1();
		System.out.println("i is "+i);
		int j=m1()*2;
		System.out.println("j is "+j);
		System.out.println(m1());
		
		
		
	}

}
