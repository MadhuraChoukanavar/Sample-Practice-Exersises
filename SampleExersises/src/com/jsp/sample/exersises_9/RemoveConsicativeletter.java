package com.jsp.sample.exersises_9;

import java.util.Scanner;

public class RemoveConsicativeletter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scn.nextLine();
		String s = s1.toLowerCase();
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				s2 = s2 + s.charAt(i);
			}

		}
		System.out.println(s2);
	}
}
