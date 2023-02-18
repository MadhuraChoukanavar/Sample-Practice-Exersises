package com.jsp.sample.exersises_4;

public class NumberOfVowelAndConsonents {

	public static void main(String[] args) {
		String s=" madhura-maitra";
		String s1=s.toLowerCase();
		int vowel=0;
		int cons=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='a'||c== 'e'||c=='i'||c=='o'||c=='u')
			{
				vowel++;
			}
			else {
				cons++;
			}
		}
		System.out.println("number of vowels"+vowel);
		System.out.println("number of consonents "+cons);
		
		}

}
