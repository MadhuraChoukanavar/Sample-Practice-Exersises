package com.jsp.sample.exersises_5_0;

import java.util.*;

public class SplitWithOutSplitAndStoreInArray {
	public static void main(String[] args) {
		ArrayList b = new ArrayList();
		String s = "i am in banglore";
		char[] a = s.toCharArray();
		int len = a.length;
		int j = 0;
		int k = 0;
		while (j < len) {
			String temp = "";
			while (j < len && a[j] != ' ') {
				j++;

			}
			while (k < j) {
				temp = temp + a[k];
				k++;
			}
			j++;
			k = j;	
			if(temp.length()==1)
			{
			b.add(temp.substring(0, 1).toUpperCase());
		
			}
			else
			{
				b.add(temp.substring(0, 1).toUpperCase()+temp.substring(1,temp.length()));
				
			}
		}

		for (int p = 0; p < b.size(); p++) {
			System.out.println(b.get(p));
		}
		System.out.println(b);
	}

}
