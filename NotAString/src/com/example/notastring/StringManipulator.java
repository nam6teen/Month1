package com.example.notastring;

/*
 * Namita Anand
 * 6 Mar 2017
 * NotAString Project
 */

public class StringManipulator {
	public String notAString(String str) {

		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}

}
