package com.jsp.sample.exersises_5_0;

public class ReplaceCharWithOutReplace {
	public static void main(String[] args) {
		String s = "pool";
		int n = s.length();
		String res = "";
		char i = 0;
		while (i < n) {
			if (s.charAt(i) == 'o' && s.charAt(i + 1) == 'o') {
				res += "xx";
				i += 2;
			} else {
				res += s.charAt(i);
				i++;
			}
		}

		System.out.println(res);

	}

}
