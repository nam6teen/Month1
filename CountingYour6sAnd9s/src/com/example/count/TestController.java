package com.example.count;

/**
 * Counts the number of 6's, 9's, consecutive 6's and consecutive 9's by taking a 
 * collection of random numbers lying between 1 and 100 and compares the results with the expected values. 
 * 
 * Namita Anand
 * 8 March 2017
 * CountingYour6sAnd9s Project
 */
import java.util.ArrayList;

public class TestController {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();

		// Test case 1: [2, 6, 6, 2, 2, 6, 9, 2, 9, 9, 9, 6, 6, 6, 6, 8]

		intList.add(2);
		intList.add(6);
		intList.add(6);
		intList.add(2);
		intList.add(2);
		intList.add(6);
		intList.add(9);
		intList.add(2);
		intList.add(9);
		intList.add(9);
		intList.add(9);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(8);

		System.out.println("Test Case 1:\n" + intList);

		// Counting the number of 6's
		int numOfSixes1 = Counter.countsSix(intList);
		int expectedSixes1 = 7;

		if (numOfSixes1 == expectedSixes1) {
			System.out.println("Number of 6's in the list: " + numOfSixes1 + " (Expected number of 6's :"
					+ expectedSixes1 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 6's in the list: " + numOfSixes1 + " (Expected number of 6's :"
					+ expectedSixes1 + ") ---> ***FAIL*** ");
		}

		// Counting the number of 9's
		int numOfNines1 = Counter.countsNine(intList);
		int expectedNines1 = 4;

		if (numOfNines1 == expectedNines1) {
			System.out.println("Number of 9's in the list: " + numOfNines1 + " (Expected number of 9's: "
					+ expectedNines1 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 9's in the list: " + numOfNines1 + " (Expected number of 9's: "
					+ expectedNines1 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive 6's
		int numOfConSixes1 = Counter.countsConsecutiveSixes(intList);
		int expectedConSixes1 = 6;

		if (numOfConSixes1 == expectedConSixes1) {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes1
					+ " (Expected number of consecutive 6's :" + expectedConSixes1 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes1
					+ " (Expected number of consecutive 6's :" + expectedConSixes1 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive nine's
		int numOfConNines1 = Counter.countsConsecutiveNines(intList);
		int expectedConNines1 = 3;

		if (numOfConNines1 == expectedConNines1) {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines1
					+ " (Expected number of consecutive 9's :" + expectedConNines1 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines1
					+ " (Expected number of consecutive 9's :" + expectedConNines1 + ") ---> ***FAIL*** ");
		}

		// Test Case 2: [1, 3, 4, 6, 6, 6, 9, 2, 9, 9, 9, 6, 6, 9, 9, 9]

		intList.clear();

		intList.add(1);
		intList.add(3);
		intList.add(4);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(9);
		intList.add(2);
		intList.add(9);
		intList.add(9);
		intList.add(9);
		intList.add(6);
		intList.add(6);
		intList.add(9);
		intList.add(9);
		intList.add(9);

		System.out.println("\nTest Case 2:\n" + intList);

		// Counting the number of 6's
		int numOfSixes2 = Counter.countsSix(intList);
		int expectedSixes2 = 5;

		if (numOfSixes2 == expectedSixes2) {
			System.out.println("Number of 6's in the list: " + numOfSixes2 + " (Expected number of 6's :"
					+ expectedSixes2 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 6's in the list: " + numOfSixes2 + " (Expected number of 6's :"
					+ expectedSixes2 + ") ---> ***FAIL*** ");
		}

		// Counting the number of 9's
		int numOfNines2 = Counter.countsNine(intList);
		int expectedNines2 = 7;

		if (numOfNines2 == expectedNines2) {
			System.out.println("Number of 9's in the list: " + numOfNines2 + " (Expected number of 9's: "
					+ expectedNines2 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 9's in the list: " + numOfNines2 + " (Expected number of 9's: "
					+ expectedNines1 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive 6's
		int numOfConSixes2 = Counter.countsConsecutiveSixes(intList);
		int expectedConSixes2 = 5;

		if (numOfConSixes2 == expectedConSixes2) {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes2
					+ " (Expected number of consecutive 6's :" + expectedConSixes2 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes2
					+ " (Expected number of consecutive 6's :" + expectedConSixes2 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive nine's
		int numOfConNines2 = Counter.countsConsecutiveNines(intList);
		int expectedConNines2 = 6;

		if (numOfConNines2 == expectedConNines2) {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines2
					+ " (Expected number of consecutive 9's :" + expectedConNines2 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines2
					+ " (Expected number of consecutive 9's :" + expectedConNines2 + ") ---> ***FAIL*** ");
		}

		// Test Case 3: [1, 3, 4, 3, 5, 7, 9, 2, 9, 9, 9, 9, 8, 9, 9, 9, 1, 3,
		// 4, 2, 2, 4, 9, 2]

		intList.clear();

		intList.add(1);
		intList.add(3);
		intList.add(4);
		intList.add(3);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(2);
		intList.add(9);
		intList.add(9);
		intList.add(9);
		intList.add(9);
		intList.add(8);
		intList.add(9);
		intList.add(9);
		intList.add(9);
		intList.add(1);
		intList.add(3);
		intList.add(4);
		intList.add(2);
		intList.add(2);
		intList.add(4);
		intList.add(9);
		intList.add(2);

		System.out.println("\nTest Case 3:\n" + intList);

		// Counting the number of 6's
		int numOfSixes3 = Counter.countsSix(intList);
		int expectedSixes3 = 0;

		if (numOfSixes3 == expectedSixes3) {
			System.out.println("Number of 6's in the list: " + numOfSixes3 + " (Expected number of 6's :"
					+ expectedSixes3 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 6's in the list: " + numOfSixes3 + " (Expected number of 6's :"
					+ expectedSixes3 + ") ---> ***FAIL*** ");
		}

		// Counting the number of 9's
		int numOfNines3 = Counter.countsNine(intList);
		int expectedNines3 = 9;

		if (numOfNines3 == expectedNines3) {
			System.out.println("Number of 9's in the list: " + numOfNines3 + " (Expected number of 9's: "
					+ expectedNines3 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 9's in the list: " + numOfNines3 + " (Expected number of 9's: "
					+ expectedNines3 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive 6's
		int numOfConSixes3 = Counter.countsConsecutiveSixes(intList);
		int expectedConSixes3 = 0;

		if (numOfConSixes3 == expectedConSixes3) {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes3
					+ " (Expected number of consecutive 6's :" + expectedConSixes3 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes3
					+ " (Expected number of consecutive 6's :" + expectedConSixes3 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive nine's
		int numOfConNines3 = Counter.countsConsecutiveNines(intList);
		int expectedConNines3 = 7;

		if (numOfConNines3 == expectedConNines3) {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines3
					+ " (Expected number of consecutive 9's :" + expectedConNines3 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines3
					+ " (Expected number of consecutive 9's :" + expectedConNines3 + ") ---> ***FAIL*** ");
		}

		// Test Case 4: [6, 6, 6, 6, 6, 6, 6, 2, 6, 6, 9]

		intList.clear();

		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(6);
		intList.add(2);
		intList.add(6);
		intList.add(6);
		intList.add(9);

		System.out.println("\nTest Case 4:\n" + intList);

		// Counting the number of 6's
		int numOfSixes4 = Counter.countsSix(intList);
		int expectedSixes4 = 9;

		if (numOfSixes4 == expectedSixes4) {
			System.out.println("Number of 6's in the list: " + numOfSixes4 + " (Expected number of 6's :"
					+ expectedSixes4 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 6's in the list: " + numOfSixes4 + " (Expected number of 6's :"
					+ expectedSixes4 + ") ---> ***FAIL*** ");
		}

		// Counting the number of 9's
		int numOfNines4 = Counter.countsNine(intList);
		int expectedNines4 = 1;

		if (numOfNines4 == expectedNines4) {
			System.out.println("Number of 9's in the list: " + numOfNines4 + " (Expected number of 9's: "
					+ expectedNines4 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of 9's in the list: " + numOfNines4 + " (Expected number of 9's: "
					+ expectedNines4 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive 6's
		int numOfConSixes4 = Counter.countsConsecutiveSixes(intList);
		int expectedConSixes4 = 9;

		if (numOfConSixes4 == expectedConSixes4) {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes4
					+ " (Expected number of consecutive 6's :" + expectedConSixes4 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 6's in the list: " + numOfConSixes4
					+ " (Expected number of consecutive 6's :" + expectedConSixes4 + ") ---> ***FAIL*** ");
		}

		// Counting the number of consecutive nine's
		int numOfConNines4 = Counter.countsConsecutiveNines(intList);
		int expectedConNines4 = 0;

		if (numOfConNines4 == expectedConNines4) {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines4
					+ " (Expected number of consecutive 9's :" + expectedConNines4 + ") ---> ***PASS*** ");
		} else {
			System.out.println("Number of consecutive 9's in the list: " + numOfConNines4
					+ " (Expected number of consecutive 9's :" + expectedConNines4 + ") ---> ***FAIL*** ");
		}

	}

}
