package com.example.stringreverse;

/**
 * The StringReverserWithoutRecursion class implements the reverse(String
 * stringToBeReversed) method from StringReverser Interface and overrides it to
 * return the reverse of the passed string without using recursion.
 * 
 * @author Namita Anand
 * @since 5 Mar 2017 
 * StringReverser Project
 */
public class StringReverserWithoutRecursion implements StringReverser {

	public StringReverserWithoutRecursion() {
	}

	public String reverse(String stringToBeReversed) {
		char[] temp = new char[stringToBeReversed.length()];

		for (int j = stringToBeReversed.length() - 1; j >= 0; --j) {
			temp[j] = stringToBeReversed.charAt(stringToBeReversed.length() - 1 - j);

		}
		String str = new String(temp);
		return str;
	}

}
