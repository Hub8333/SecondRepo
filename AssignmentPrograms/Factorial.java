package com.technoelevate.practiceprograms;

public class Factorial {
	public static void main(String[] args) {
		int a,fact;
		a = 10;
		fact = 1;

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
