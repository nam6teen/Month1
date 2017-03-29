package com.example.backfrontimplementation;

/**
 * Namita Anand
 * 11 March 2017
 * BackFrontImplementation Project
 */
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! Please enter a string: ");
		String str = scanner.nextLine();

		String result = BackFrontImplementer.implementsBackFront(str);

		System.out.println("implementsBackFront(\"" + str + "\")---> " + result);

	}

}
