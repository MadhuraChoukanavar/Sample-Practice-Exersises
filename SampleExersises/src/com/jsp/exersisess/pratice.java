package com.jsp.exersisess;
public class pratice 
{
	static int m1(){
		System.out.println("m1 executed");
		return 10;
		
	}
		public static void main(String[] args) {
			m1();
			int i=m1();
			System.out.println(i);
			int j=m1()*2;
			System.out.println(j);
			System.out.println(m1());
		}
	}


