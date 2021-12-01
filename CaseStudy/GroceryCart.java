package com.technoelevate.mycollectioniteration;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryCart {
	private String itemName;
	private double itemPrice;
	static Scanner sc = new Scanner(System.in);

	static ArrayList arr = new ArrayList();

	public static void add() {

		System.out.println("Enter the number of items to add");
		int a = sc.nextInt();
		System.out.println("Select the items to add");
		for (int i = 0; i < a; i++) {
			arr.add(sc.next());
		}
		System.out.println(a + " Items are added...");
	}

	public static void view() {
		System.out.println(arr);
	}

	public static void delete() {
		System.out.println("Enter the index to Remove");
		int index = sc.nextInt();
		arr.remove(index);
		view();

	}

	public static void check() {
		
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add the items");
		System.out.println("Enter 2 to view items");
		System.out.println("Enter 3 to delete the items");
		System.out.println("Enter 4 to search the item");
	//	int choice = sc.nextInt();
	}

}
