package com.full.implementation;
/**
 * The class MyString overrides all the abstract methods from the AbstractMyString class.
 * 
 * Namita Anand 
 * 11 March 2017 
 * MyStringDemo Project
 *
 */

import com.full.util.AbstractMyString;

public class MyString extends AbstractMyString {

	public MyString() {
	}

	public MyString(String a) {
		theString = a;
	}

	public String toString() {
		return theString;
	}

	public String reverse() {
		int length = getLength();
		char[] value = new char[length];

		for (int j = length - 1; j >= 0; --j) {
			value[j] = theString.charAt(length - 1 - j);

		}
		String str = new String(value);
		return str;
	}

	public int getVowelsCount() {

		int length = getLength();
		int vowCount = 0;
		char[] value = new char[length];

		for (int i = 0; i < length; i++) {
			value[i] = theString.charAt(i);
			if ((value[i] == 'A') || (value[i] == 'a') || (value[i] == 'E') || (value[i] == 'e') || (value[i] == 'I')
					|| (value[i] == 'i') || (value[i] == 'O') || (value[i] == 'o') || (value[i] == 'U')
					|| (value[i] == 'u')) {
				vowCount++;
			}
		}
		return vowCount;
	}

	public int getConsonantCount() {

		return (getLength() - getVowelsCount());

	}

	public int getNumCapitalLetters() {
		int length = getLength();
		int capCount = 0;
		char[] value = new char[length];
		for (int i = 0; i < length; i++) {
			value[i] = theString.charAt(i);
			if (value[i] >= 65 && value[i] <= 90) {
				capCount++;
			}
		}

		return capCount;
	}

	public int getLength() {
		int length = 0;
		try {
			while (true) {

				theString.charAt(length);
				length++;
			}
		} catch (Exception e) {

		}
		return length;
	}

	public int getSumOfAllCharacters() {

		int length = getLength();
		char[] value = new char[length];
		int code = 0, sum = 0;

		for (int i = 0; i < length; i++) {
			value[i] = theString.charAt(i);
			if (value[i] >= 65 && value[i] <= 90) {
				code = value[i] - 64;
				sum = sum + code;
			} else if (value[i] >= 97 && value[i] <= 122) {
				code = value[i] - 96;
				sum = sum + code;
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		AbstractMyString str = new MyString("Inspiration");

		// Testing toString()

		String toStr = str.toString();
		String expectedStr = "Inspiration";

		if (toStr.equals(expectedStr)) {
			System.out.println("expected string: " + expectedStr + "  result: " + toStr + " ***PASS***");
		} else {
			System.out.println("expected string: " + expectedStr + "  result: " + toStr + " ***FAIL***");
		}

		// Testing reverse()

		String rev = str.reverse();
		String expectedRev = "noitaripsnI";

		if (rev.equals(expectedRev)) {
			System.out.println("expected string: " + expectedRev + "  result: " + rev + " ***PASS***");
		} else {
			System.out.println("expected string: " + expectedRev + "  result: " + rev + " ***FAIL***");
		}

		// Testing getVowelsCount()

		int vowCount = str.getVowelsCount();
		int expectedVCount = 5;

		if (vowCount == expectedVCount) {
			System.out
					.println("expected number of vowels: " + expectedVCount + "  result: " + vowCount + " ***PASS***");
		} else {
			System.out
					.println("expected number of vowels: " + expectedVCount + "  result: " + vowCount + " ***FAIL***");
		}

		// Testing getConsonantCount()

		int conCount = str.getConsonantCount();
		int expectedCount = 6;

		if (conCount == expectedCount) {
			System.out.println(
					"expected number of consonants: " + expectedCount + "  result: " + conCount + " ***PASS***");
		} else {
			System.out.println(
					"expected number of consonants: " + expectedCount + "  result: " + conCount + " ***FAIL***");
		}

		// Testing getNumCapitalLetters()

		int capCount = str.getNumCapitalLetters();
		int expectedCapCount = 1;

		if (capCount == expectedCapCount) {
			System.out.println("expected number of capital letters: " + expectedCapCount + "  result: " + capCount
					+ " ***PASS***");
		} else {
			System.out.println("expected number of capital letters: " + expectedCapCount + "  result: " + capCount
					+ " ***FAIL***");
		}

		// Testing getLength()

		int len = str.getLength();
		int expectedLen = 11;

		if (len == expectedLen) {
			System.out.println("expected length: " + expectedLen + "  result: " + len + " ***PASS***");
		} else {
			System.out.println("expected length: " + expectedLen + "  result: " + len + " ***FAIL***");
		}

		// Testing getSumOfAllCharacters()

		int sum = str.getSumOfAllCharacters();
		int expectedSum = 144;

		if (sum == expectedSum) {
			System.out.println("expected sum: " + expectedSum + "  result: " + sum + " ***PASS***");
		} else {
			System.out.println("expected sum: " + expectedSum + "  result: " + sum + " ***FAIL***");
		}

	}
}
