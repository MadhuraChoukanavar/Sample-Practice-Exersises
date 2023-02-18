package com.jsp.exersisess;
import java.util.Scanner;

class revnum
{
	
	public int length(int num)
	{
	int len=0; 
	while(num>0) 
		{
		len++;
		num=num/10;
		}
		return len;
		
	}
public int Rever(int num)
	{
		
		int rev=0;
		while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	
		return rev;
	}
	
		public int sum (int num) 
	{
		revnum l1=new revnum();
		int len=l1.length(num);
		for(int i=len;i>3;i--)
        {
        	len--;
        	num=num/10;
        	
        }
        System.out.println(num);
        System.out.println(len);
        int sum=0;
        while(num>0)
       {
    	   sum=num%10+sum;
    	   num=num/10;
	   }
       return sum;
	
		
	}
	
	
	
	public int prime(int num)
	{
		if (num<1) return num;
		
		if(num>1)
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num/i==0) return num;
				
			}
		}
		System.out.println("prime");
		int sum=0;
		while(num>0) {
		sum=num%10+sum;
		num=num/10;
		}
		return sum;
	}
 
}







public class ReverseOfNum 
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		
		
		
	    revnum a1=new revnum();
		int Result=a1.Rever(number);
		
        System.out.println(Result);
       int sum= a1.sum(Result);
       System.out.println(sum);
       int Prime=a1.prime(sum);
   }
}

