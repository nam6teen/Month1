package com.example.countmultiples;

/**
 * MultipleCounter Class has a method multipleOf3Or5Only(int n) that checks
 * whether 'n' is a multiple of either 3 or 5 only.
 * 
 * Namita Anand 9 March 2017 CountingMultipleOf3Or5Only Project
 */

public class MultipleCounter {

	public static boolean multipleOf3Or5Only(int n) {

		if ((n % 3 == 0 || n % 5 == 0) && (n % 15 != 0))
			return true;
		else
			return false;
	}

}
