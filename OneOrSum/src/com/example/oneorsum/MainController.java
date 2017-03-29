package com.example.oneorsum;

/*
 * Namita Anand
 * 3 Mar 2017
 * OneOrSum Project
 */

public class MainController {
	
	public static boolean isOneOrSum10(int a, int b) {
		boolean result;
		if (a == 10 || b == 10 || (a + b) == 10) {
			result = true;
			;
		} else {
			result = false;

		}
		return result;
	}

	public static void main(String[] args) {

		boolean result1 = isOneOrSum10(9, 10);
		boolean result2 = isOneOrSum10(9, 9);
		boolean result3 = isOneOrSum10(1, 9);

		boolean expected1 = true;
		boolean expected2 = false;
		boolean expected3 = true;

		if (result1 == expected1) {
			System.out.println("isOneOrSum10(9, 10) expected-->" + expected1 + " result-->" + result1 + " Pass");
		} else {
			System.out.println("isOneOrSum10(9, 10) expected-->" + expected1 + " result-->" + result1 + " Fail");
		}

		if (result2 == expected2) {
			System.out.println("isOneOrSum10(9, 9) expected-->" + expected2 + " result--> " + result2 + " Pass");
		} else {
			System.out.println("isOneOrSum10(9, 9) expected-->" + expected2 + " result-->" + result2 + " Fail");
		}
		if (result3 == expected3) {
			System.out.println("isOneOrSum10(1, 9) expected-->" + expected3 + " result-->" + result3 + " Pass");
		} else {
			System.out.println("isOneOrSum10(1, 9) expected-->" + expected3 + " result-->" + result3 + " Fail");
		}

	}

}
