package com.jsp.sample.exersises_5;

import java.util.ArrayList;

//not got out put taking string and storing in arrayn//
public class SplitWithOutSplit {
	public static void main(String[] args) {
		
	
	String s="i am in banglore";
	s=s+' ';
	
	ArrayList<String>  b=new ArrayList<String>();
	char[] a=s.toCharArray();
	int len=s.length()-1;
	int i=0;
	int j=0;
	String temp="";
	for(int x=0;x<a.length;x++)
	{
		
		if(a[x]!=' ')
		{
			
			temp+=a[x];
		}
		else if(x<=len)
		{
			if(temp.length()==1)
			{
			b.add(temp.substring(0, 1).toUpperCase());
		
			}
			else
			{
				b.add(temp.substring(0, 1).toUpperCase()+temp.substring(1,temp.length()));
				
			}
			
			temp="";
		}
		
		
	}
	
	System.out.println(b.toString());
	
	
	/*
	 * while(j<len) { if(i<len&&a[j]!=' ')j++; String temp =""; // int k=j-1; //
	 * while(k>=i) // { temp=temp+a[k]; k--; //System.out.print(temp); // }
	 * b.add(temp);
	 * 
	 * j++; i=j; }
	 */
	
		for(int k=0;k<b.size();k++)
		{
			System.out.println(b.get(k));
		}
	
	}

	

}
