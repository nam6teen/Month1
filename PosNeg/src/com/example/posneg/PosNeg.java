package com.example.posneg;

/*
 * Namita Anand
 * 3 Mar 2017
 * PosNeg Project
 */

public class PosNeg {
	public static boolean posNeg(int a, int b, boolean negative) {
		if (a > 0 && b < 0 || a < 0 && b > 0) {
			if (negative == true) {
				return false;
			} else {
				return true;
			}

		} else if (a < 0 && b < 0 && negative == true) {
			return true;
		} else {
			return false;
		}
	}

}
