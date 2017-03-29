package com.example.stringreverse;

/**
 * The StringReverserWithRecursion class implements the reverse(String
 * stringToBeReversed) method from StringReverser Interface and overrides it to
 * return the reverse of the passed string using recursion.
 * 
 * @author Namita Anand
 * @since 5 Mar 2017 StringReverser Project
 */
public class StringReverserWithRecursion implements StringReverser {

	public StringReverserWithRecursion() {
	}

	public String reverse(String stringToBeReversed) {
		if (stringToBeReversed.length() == 1) {
			return stringToBeReversed;
		} else {
			return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);

		}

	}
}
