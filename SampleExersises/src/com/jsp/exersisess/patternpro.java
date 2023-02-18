package com.jsp.exersisess;
import java.util.Scanner;
public class patternpro {

	public static void main(String[] args) {
		
Scanner scn=new Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
	if(i%2!=0)
	{
		int x=((i-1)*n)+1;
		for(int j=1;j<=n;j++) 
		{
			System.out.print(x + " ");
			x++;
		}
	}
	else {
		int x=i*n;
		for(int j=1;j<=n;j++)
		{
			System.out.print(x + " ");
			x--;
		}
	}
	System.out.println();
	}
	}

}
