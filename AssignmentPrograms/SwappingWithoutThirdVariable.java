package com.technoelevate.practiceprograms;

public class SwappingWithoutThirdVariable {
	public static void main(String[] args) {
		int a,b;
		a = -50;
		b = 20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Aftere swapping A : "+a);
		System.out.println("After swapping B : "+b);
	}

}
