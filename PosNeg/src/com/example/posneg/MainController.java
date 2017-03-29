package com.example.posneg;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! Please enter two integers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Please enter a value for negative (true/false): ");
		boolean negative = scanner.nextBoolean();
		boolean result = PosNeg.posNeg(a, b, negative);

		System.out.println("posNeg(" + a + "," + b + "," + negative + ") -->" + result);
	}

}
