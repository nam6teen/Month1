package com.example.countmultiples;

import java.util.Scanner;

/**
 * Gets an integer n from the user and checks whether the a number is multiple
 * of either 3 or 5 only.
 * 
 * Namita Anand 9 March 2017 CountingMultipleOf3Or5Only Project
 */

public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int n = scanner.nextInt();

		boolean result = MultipleCounter.multipleOf3Or5Only(n);

		System.out.println("multipleOf3Or5Only(" + n + ")--->" + result);

	}

}
