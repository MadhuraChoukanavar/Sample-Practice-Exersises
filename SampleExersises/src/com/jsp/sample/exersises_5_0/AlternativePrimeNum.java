package com.jsp.sample.exersises_5_0;
import java.util.Scanner;
public class AlternativePrimeNum {
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the range");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int count = 0;
		for (int i = x; i <= y; i++) {
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if(count %2==0)
				System.out.println(i);
			}
		}
	}
}
