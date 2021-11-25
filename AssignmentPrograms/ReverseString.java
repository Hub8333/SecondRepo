package com.technoelevate.practiceprograms;

public class ReverseString {
	public static void main(String[] args) {
		String str = "mal";
		String str1 = "";
		
		for(int i=0;i<str.length();i++) {
			str1 = str.charAt(i)+str1;
		}
		
		if(str1.equals(str)) {
			System.out.println("it is a palindrome");
		}
		else 
			System.out.println("it is not a palindrome");
	}

}
