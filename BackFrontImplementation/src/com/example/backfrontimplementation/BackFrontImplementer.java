package com.example.backfrontimplementation;

/**
 * Given a string n, returns a string where the first two characters have been
 * reversed and the last two characters have been reversed(If the string length
 * is smaller than 4, then swap the first character and last character only).
 * 
 * Namita Anand 
 * 11 March 2017 
 * BackFrontImplementation Project
 *
 */
public class BackFrontImplementer {

	public static String implementsBackFront(String str) {

		int length = str.length();
		char[] value = str.toCharArray();
		String backFront = "";

		if (length < 4) {

			char temp = value[0];
			value[0] = value[length - 1];
			value[length - 1] = temp;
			backFront = new String(value);

		} else {
			char temp = value[0];
			value[0] = value[1];
			value[1] = temp;
			temp = value[length - 1];
			value[length - 1] = value[length - 2];
			value[length - 2] = temp;
			backFront = new String(value);

		}
		return backFront;
	}

	public static void main(String[] args) {

		// Test Case 1:
		String result1 = implementsBackFront("hello world");
		String expected1 = "ehllo wordl";

		if (result1.equals(expected1)) {
			System.out.println("implementsBackFront(\"hello world\")   expected---> " + expected1 + "  result---> "
					+ result1 + "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"hello world\")   expected---> " + expected1 + "  result---> "
					+ result1 + "  ***FAIL***");
		}

		// Test Case 2:

		String result2 = implementsBackFront("cat");
		String expected2 = "tac";

		if (result2.equals(expected2)) {
			System.out.println("implementsBackFront(\"cat\")   expected---> " + expected2 + "  result---> " + result2
					+ "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"cat\")   expected---> " + expected2 + "  result---> " + result2
					+ "  ***FAIL***");
		}

		// Test Case 3:

		String result3 = implementsBackFront("or");
		String expected3 = "ro";

		if (result3.equals(expected3)) {
			System.out.println("implementsBackFront(\"or\")   expected---> " + expected3 + "  result---> " + result3
					+ "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"or\")   expected---> " + expected3 + "  result---> " + result3
					+ "  ***FAIL***");
		}

		// Test Case 4:

		String result4 = implementsBackFront("Fun");
		String expected4 = "nuF";

		if (result4.equals(expected4)) {
			System.out.println("implementsBackFront(\"Fun\")   expected---> " + expected4 + "  result---> " + result4
					+ "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Fun\")   expected---> " + expected4 + "  result---> " + result4
					+ "  ***FAIL***");
		}

		// Test Case 5:

		String result5 = implementsBackFront("Void");
		String expected5 = "oVdi";

		if (result5.equals(expected5)) {
			System.out.println("implementsBackFront(\"Void\")   expected---> " + expected5 + "  result--->" + result5
					+ "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Void\")   expected---> " + expected5 + "  result--->" + result5
					+ "  ***FAIL***");
		}

		// Test Case 6:

		String result6 = implementsBackFront("Magic");
		String expected6 = "aMgci";

		if (result6.equals(expected6)) {
			System.out.println("implementsBackFront(\"Magic\")   expected---> " + expected6 + "  result--->" + result6
					+ "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Magic\")   expected---> " + expected6 + "  result--->" + result6
					+ "  ***FAIL***");
		}

		// Test Case 7:

		String result7 = implementsBackFront("Mathematics");
		String expected7 = "aMthematisc";

		if (result7.equals(expected7)) {
			System.out.println("implementsBackFront(\"Mathematics\")   expected---> " + expected7 + "  result---> "
					+ result7 + "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Mathematics\")   expected---> " + expected7 + "  result---> "
					+ result7 + "  ***FAIL***");
		}

		// Test Case 8:

		String result8 = implementsBackFront("Implement BackFront");
		String expected8 = "mIplement BackFrotn";

		if (result8.equals(expected8)) {
			System.out.println("implementsBackFront(\"Implement BackFront\")   expected---> " + expected8
					+ "  result---> " + result8 + "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Implement BackFront\")   expected---> " + expected8
					+ "  result---> " + result8 + "  ***FAIL***");
		}

		// Test Case 9:

		String result9 = implementsBackFront("Fast and Furious");
		String expected9 = "aFst and Furiosu";

		if (result9.equals(expected9)) {
			System.out.println("implementsBackFront(\"Fast and Furious\")   expected---> " + expected9 + "  result--->"
					+ result9 + "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Fast and Furious\")   expected---> " + expected9 + "  result--->"
					+ result9 + "  ***FAIL***");
		}

		// Test Case 10:

		String result10 = implementsBackFront("Laughter is the best medicine.");
		String expected10 = "aLughter is the best medicin.e";

		if (result10.equals(expected10)) {
			System.out.println("implementsBackFront(\"Laughter is the best medicine.\")   expected---> " + expected10
					+ "  result--->" + result10 + "  ***PASS***");
		} else {
			System.out.println("implementsBackFront(\"Laughter is the best medicine.\")   expected---> " + expected10
					+ "  result--->" + result10 + "  ***FAIL***");
		}

	}

}
