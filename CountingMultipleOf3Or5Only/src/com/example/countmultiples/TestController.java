package com.example.countmultiples;

/**
 * Tests whether the a number is multiple of either 3 or 5 only.
 * 
 * Namita Anand 
 * 9 March 2017 
 * CountingMultipleOf3Or5Only Project
 */

public class TestController {

	public static void main(String[] args) {

		// Test Case 1:

		boolean result1 = MultipleCounter.multipleOf3Or5Only(25);
		boolean expected1 = true;

		if (result1 == expected1) {
			System.out.println(
					"multipleOf3Or5Only(25)  expected-->" + expected1 + "  result-->" + result1 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(25)  expected-->" + expected1 + "  result-->" + result1 + "  ***Fail***");
		}

		// Test Case 2:

		boolean result2 = MultipleCounter.multipleOf3Or5Only(26);
		boolean expected2 = false;

		if (result2 == expected2) {
			System.out.println(
					"multipleOf3Or5Only(26)  expected-->" + expected2 + "  result-->" + result2 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(26)  expected-->" + expected2 + "  result-->" + result2 + "  ***Fail***");
		}

		// Test Case 3:

		boolean result3 = MultipleCounter.multipleOf3Or5Only(15);
		boolean expected3 = false;

		if (result3 == expected3) {
			System.out.println(
					"multipleOf3Or5Only(15)  expected-->" + expected3 + "  result-->" + result3 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(15)  expected-->" + expected3 + "  result-->" + result3 + "  ***Fail***");
		}

		// Test Case 4:

		boolean result4 = MultipleCounter.multipleOf3Or5Only(6);
		boolean expected4 = true;

		if (result4 == expected4) {
			System.out.println(
					"multipleOf3Or5Only(6)  expected-->" + expected4 + "  result-->" + result4 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(6)  expected-->" + expected4 + "  result-->" + result4 + "  ***Fail***");
		}

		// Test Case 5:

		boolean result5 = MultipleCounter.multipleOf3Or5Only(50);
		boolean expected5 = true;

		if (result3 == expected3) {
			System.out.println(
					"multipleOf3Or5Only(50)  expected-->" + expected5 + "  result-->" + result5 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(50)  expected-->" + expected5 + "  result-->" + result5 + "  ***Fail***");
		}

		// Test Case 6:

		boolean result6 = MultipleCounter.multipleOf3Or5Only(60);
		boolean expected6 = false;

		if (result6 == expected6) {
			System.out.println(
					"multipleOf3Or5Only(60)  expected-->" + expected6 + "  result-->" + result6 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(60)  expected-->" + expected6 + "  result-->" + result6 + "  ***Fail***");
		}

		// Test Case 7:

		boolean result7 = MultipleCounter.multipleOf3Or5Only(7);
		boolean expected7 = false;

		if (result7 == expected7) {
			System.out.println(
					"multipleOf3Or5Only(7)  expected-->" + expected7 + "  result-->" + result7 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(7)  expected-->" + expected7 + "  result-->" + result7 + "  ***Fail***");
		}

		// Test Case 8:

		boolean result8 = MultipleCounter.multipleOf3Or5Only(20);
		boolean expected8 = true;

		if (result8 == expected8) {
			System.out.println(
					"multipleOf3Or5Only(20)  expected-->" + expected8 + "  result-->" + result8 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(20)  expected-->" + expected8 + "  result-->" + result8 + "  ***Fail***");
		}

		// Test Case 9:

		boolean result9 = MultipleCounter.multipleOf3Or5Only(42);
		boolean expected9 = true;

		if (result9 == expected9) {
			System.out.println(
					"multipleOf3Or5Only(42)  expected-->" + expected9 + "  result-->" + result9 + "  ***Pass***");
		} else {
			System.out.println(
					"multipleOf3Or5Only(42)  expected-->" + expected9 + "  result-->" + result9 + "  ***Fail***");
		}
	}

}
