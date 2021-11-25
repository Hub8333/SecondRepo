 package com.technoelevate.practiceprograms;

public class Swapping {
	public static void main(String[] args) {
		int a,b,c;
		a = -20;
		System.out.println("Before swapping A : "+a);
		b = 10;
		System.out.println("Before swapping B : "+b);
		
		c = a+b;
		
		a = c-a;
		b = c-a;
		System.out.println("After swapping A : "+a);
		System.out.println("After swapping B : "+b);
	}
	

}
