package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;
import java.util.Scanner;

import com.technoelevate.practiceprograms.Array;

public class Cart {
	private static ArrayList arr = new ArrayList();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter 1 to add the items");
//		System.out.println("Enter 2 to view items");
//		System.out.println("Enter 3 modify the items");
//		System.out.println("Enter 4 to search the item");
		int num = 1;
		while(num==1) {
			num=0;
			GroceryCart.menu();
			System.out.println("Enter valid input");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			GroceryCart.add();
			break;

		case 2:
			GroceryCart.view();
			//GroceryCart.menu();
			break;

		case 3:
			GroceryCart.delete();
			//GroceryCart.menu();
			break;
		default :
			System.out.println("Invalid number...Enter Again");

		}
		System.out.println("Press 1 to continue...");
		num = sc.nextInt();
		}

	}

}
