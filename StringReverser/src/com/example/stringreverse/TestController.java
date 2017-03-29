package com.example.stringreverse;

/**
 * The TestController program reverses the strings stored in str1,str2,str3 and
 * str4 using the method reverse(String stringToBeReversed), stores the
 * respective results in reverse1, reverse2, reverse3 and reverse4 , and finally
 * compares the results with the values stored in expected1,expected2,expected3
 * and expected4.
 * 
 * @author Namita Anand
 * @since 5 Mar 2017 StringReverser Project
 */

public class TestController {

	public static void main(String[] args) {
		StringReverserWithoutRecursion srwor = new StringReverserWithoutRecursion();

		String str1 = "Namita Anand";
		String expected1 = "dnanA atimaN";
		String reverse1 = srwor.reverse(str1);

		if (reverse1.equals(expected1)) {
			System.out.println("String-->" + str1 + " Expected output(without recursion)-->" + expected1 + " Reverse-->"
					+ reverse1 + " ***PASS***");
		} else {
			System.out.println("String-->" + str1 + " Expected output(without recursion)-->" + expected1 + " Reverse-->"
					+ reverse1 + " ***FAIL***");
		}

		String str2 = "I am learning Java.";
		String expected2 = ".avaJ gninrael ma I";
		String reverse2 = srwor.reverse(str2);

		if (reverse2.equals(expected2)) {
			System.out.println("String-->" + str2 + " Expected output(without recursion)-->" + expected2 + " Reverse-->"
					+ reverse2 + " ***PASS***");
		} else {
			System.out.println("String-->" + str2 + " Expected output(without recursion)-->" + expected2 + " Reverse-->"
					+ reverse2 + " ***FAIL***");
		}

		StringReverserWithRecursion srwr = new StringReverserWithRecursion();

		String str3 = "Hello World!";
		String expected3 = "!dlroW olleH";
		String reverse3 = srwr.reverse(str3);

		if (reverse3.equals(expected3)) {
			System.out.println("String-->" + str3 + " Expected output(with recursion)-->" + expected3 + " Reverse-->"
					+ reverse3 + " ***PASS***");
		} else {
			System.out.println("String-->" + str3 + " Expected output(with recursion)-->" + expected3 + " Reverse-->"
					+ reverse3 + " ***FAIL***");
		}

		String str4 = "Harry Potter";
		String expected4 = "rettoP yrraH";
		String reverse4 = srwr.reverse(str4);

		if (reverse4.equals(expected4)) {
			System.out.println("String-->" + str4 + " Expected output(with recursion)-->" + expected4 + " Reverse-->"
					+ reverse4 + " ***PASS***");
		} else {
			System.out.println("String-->" + str4 + " Expected output(with recursion)-->" + expected4 + " Reverse-->"
					+ reverse4 + " ***FAIL***");
		}

		String str5 = "";
		String expected5 = "";
		String reverse5 = srwr.reverse(str5);

		if (reverse5.equals(expected5)) {
			System.out.println("String-->" + str5 + " Expected output(with recursion)-->" + expected5 + " Reverse-->"
					+ reverse5 + " ***PASS***");
		} else {
			System.out.println("String-->" + str5 + " Expected output(with recursion)-->" + expected5 + " Reverse-->"
					+ reverse5 + " ***FAIL***");
		}
	}

}
