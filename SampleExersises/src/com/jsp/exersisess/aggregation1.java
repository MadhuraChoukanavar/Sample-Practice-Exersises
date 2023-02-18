package com.jsp.exersisess;
 class reverse
 {
	 public int rev(int num)
	 {
		int rev=0;
		while(num>0) {
			rev=rev*10 + num %10;
			num=num/10;
		}
		System.out.println(rev);
		return rev;
	 }
 }
class add
{
	reverse r1;
	 public int sum(int num)
	 {
		r1=new reverse();
		int rev = r1.rev(num);
		int sum = 0;
		while(rev > 0) {
			sum += rev%10;
			rev /= 10;
		}
		return sum;
	 }
	}




public class aggregation1 
{
	public static void main(String[] args) {
		add a1=new add();
		System.out.println(a1.sum(1025));
	}

}
