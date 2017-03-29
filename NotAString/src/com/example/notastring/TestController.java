package com.example.notastring;

/*
 * Namita Anand
 * 6 Mar 2017
 * NotAString Project
 */
public class TestController {

	public static void main(String[] args) {
		StringManipulator sm = new StringManipulator();

		String result1 = sm.notAString("going to happen");
		String expected1 = "not going to happen";

		if (result1.equals(expected1)) {
			System.out.println("notAString(\"going to happen\")--->" + result1 + " ***PASS***");
		} else {
			System.out.println("notAString(\"going to happen\")--->" + result1 + " ***FAIL***");
		}

		String result2 = sm.notAString("a");
		String expected2 = "not a";

		if (result2.equals(expected2)) {
			System.out.println("notAString(\"a\")--->" + result2 + " ***PASS***");
		} else {
			System.out.println("notAString(\"a\")--->" + result2 + " ***FAIL***");
		}

		String result3 = sm.notAString("not interested");
		String expected3 = "not interested";

		if (result3.equals(expected3)) {
			System.out.println("notAString(\"not interested\")--->" + result3 + " ***PASS***");
		} else {
			System.out.println("notAString(\"not interested\")--->" + result3 + " ***FAIL***");
		}
	}

}
