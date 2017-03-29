package com.example.comparison;

/**
 * ConcatenationComparator class calculates the total time taken for 100000
 * concatenation operations on String, StringBuffer and StringBuilder Objects.
 * 
 * Namita Anand 
 * 26 March 2017
 * DifferenceBetweenStringStringBufferAndStringBuilder Project
 *
 */
public class ConcatenationComparator {

	public static void main(String[] args) {

		final int MAX = 100000;

		// Calculating time for 100000 concatenation operations on String
		// Objects...
		String stringOne = "Stay";
		String stringTwo = "Positive";
		String result = "";

		Long startTimeForString = System.currentTimeMillis();

		for (int i = 1; i < MAX; i++) {
			result = stringOne.concat(stringTwo);
		}

		Long stopTimeForString = System.currentTimeMillis();

		Long totalTimeForStringObject = stopTimeForString - startTimeForString;

		System.out.println("Total time taken for " + MAX + " concatenation operations on String objects is "
				+ totalTimeForStringObject + " ms");

		// Calculating time for 100000 concatenation operations on StringBuffer
		// Objects..
		StringBuffer stringBufferOne = new StringBuffer(stringOne);
		StringBuffer stringBufferTwo = new StringBuffer(stringTwo);
		StringBuffer resultOfStringBufferConcatenation = null;

		Long startTimeForStringBuffer = System.currentTimeMillis();

		for (int i = 1; i < MAX; i++) {
			resultOfStringBufferConcatenation = stringBufferOne.append(stringBufferTwo);
		}

		Long stopTimeForStringBuffer = System.currentTimeMillis();

		Long totalTimeForStringBufferConcatenation = stopTimeForStringBuffer - startTimeForStringBuffer;

		System.out.println("Total time taken for " + MAX + " concatenation operations on StringBuffer objects is "
				+ totalTimeForStringBufferConcatenation + " ms");

		// Calculating time for 100000 concatenation operations on StringBuilder
		// Objects..
		StringBuilder stringBuilderOne = new StringBuilder(stringOne);
		StringBuilder stringBuilderTwo = new StringBuilder(stringTwo);
		StringBuilder resultOfStringBuilderConcatenation = null;

		Long startTimeForStringBuilder = System.currentTimeMillis();

		for (int i = 1; i < MAX; i++) {
			resultOfStringBuilderConcatenation = stringBuilderOne.append(stringBuilderTwo);
		}

		Long stopTimeForStringBuilder = System.currentTimeMillis();

		Long totalTimeForStringBuilderConcatenation = stopTimeForStringBuilder - startTimeForStringBuilder;

		System.out.println("Total time taken for " + MAX + " concatenation operations on StringBuilder objects is "
				+ totalTimeForStringBuilderConcatenation + " ms");
	}

}
