package com.example.stringreverse;

/**
 * The TimingCodeTester program implements a method called
 * runTimingTest(StringReverser stringReverser) method that gives the total time
 * taken by the method reverse(String stringToBeReversed) for two cases where
 * one uses recursion and the other doesn't.
 * 
 * @author Namita Anand
 * @since 5 Mar 2017 
 * StringReverser Project
 */

public class TimingCodeTester {

	private static final int NUM_ITERATIONS = 10000;

	public static void runTimingTest(StringReverser stringReverser) {
		if (stringReverser instanceof StringReverserWithoutRecursion) {
			long start = System.currentTimeMillis();
			String result = "";
			for (int i = 0; i < NUM_ITERATIONS; i++) {
				result = (new StringReverserWithoutRecursion()).reverse("Namita");
			}
			long stop = System.currentTimeMillis();
			long totalTimeTaken = stop - start;
			System.out.println("Total time for no recursion is " + totalTimeTaken);
		}

		else {
			long start = System.currentTimeMillis();
			String result = "";
			for (int i = 0; i < NUM_ITERATIONS; i++) {
				result = (new StringReverserWithRecursion()).reverse("Namita");
			}
			long stop = System.currentTimeMillis();
			long totalTimeTaken = stop - start;
			System.out.println("Total time for recursion is " + totalTimeTaken);
		}

	}

	public static void main(String args[]) {

		runTimingTest(new StringReverserWithoutRecursion());
		runTimingTest(new StringReverserWithRecursion());

	}

}
