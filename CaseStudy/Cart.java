package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;
import java.util.Scanner;

import com.technoelevate.practiceprograms.Array;

public class Cart {
	private static ArrayList arr = new ArrayList();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 to add the items");
		System.out.println("Enter 2 to view items");
		System.out.println("Enter 3 modify the items");
		System.out.println("Enter 4 to search the item");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			GroceryCart.add();
			GroceryCart.menu();

		case 2:
			GroceryCart.view();
			GroceryCart.menu();

		case 3:
			GroceryCart.delete();
			GroceryCart.menu();

		}

	}

}
