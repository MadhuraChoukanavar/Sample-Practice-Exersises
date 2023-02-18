package com.jsp.sample.exersises_6;

public class CountCharNumSplChar {
	public static void main(String[] args) {
		
	
	String s="AaAbAcDdD1@001";
	
//	char[] a=s.toCharArray();
	int SmallChars=0;
	int nums=0;
	int capChars=0;
	int splChars=0;
	String s1="";
	String s2="";
	String s3="";
	String s4="";
	
	
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	if(c>='A'&&c<='Z')
	{
		 capChars++;
		 if(s1.indexOf(c)==-1)s1=s1+(c+"");
	}
	else if(c>='a'&&c<='z')
	{
		SmallChars++;	
		 if(s2.indexOf(c)==-1)s2=s2+(c+"");
	}
	else if(c>='0'&&c<='9')
	{
		nums++;	
		 if(s3.indexOf(c)==-1)s3=s3+(c+"");
	}
	else
	{
		splChars++;
		 if(s4.indexOf(c)==-1)s4=s4+(c+"");
	}
	}
	System.out.println(" num of cap letters "+ capChars  + "             the letters are " + s1);
	System.out.println(" num of small letters "+ SmallChars + "           the letters are "+s2);
	System.out.println(" num of digits "+ nums +"                         the numbers are "+ s3);
	System.out.println(" num of special chars "+ splChars +"                 the special chars are "+ s4);
	
}

}
