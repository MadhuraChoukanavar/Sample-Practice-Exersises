package com.jsp.sample.exersises_4;

public class ReversingString {

	public static void main(String[] args) {
		String s="madhura";
		System.out.println(rev(s));

	}
     public static String rev(String s)
     {
    	 char[] a=s.toCharArray();
    	 int i=0;
    	 int j=a.length-1;
    	 while(i<j)
    	 {
    		 char temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    		 i++;
    		 j--;
    	 }
    	 return new String(a);
    	 
     }
}
