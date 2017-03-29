package com.example.count;

/**
 * Counter is class that implements methods to count the number of 6's, 9's, consecutive 6's and consecutive 9's.
 * 
 * Namita Anand
 * 8 March 2017
 * CountingYour6sAnd9s Project
 */
import java.util.ArrayList;

public class Counter {

	// Counting the number of 6's
	public static int countsSix(ArrayList<Integer> arrList) {

		int countSix = 0;
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) == 6) {
				++countSix;
			}
		}
		return countSix;
	}

	// Counting the number of 9's
	public static int countsNine(ArrayList<Integer> arrList) {

		int countNine = 0;

		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) == 9) {
				++countNine;
			}
		}
		return countNine;

	}

	// Counting the number of consecutive 6's
	public static int countsConsecutiveSixes(ArrayList<Integer> arrList) {

		int conSix = 0;
		int preNum = 0;
		int tempCount = 0;
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) == preNum) {
				if (tempCount == 1) {
					conSix++;
					tempCount = 0;
				}
				conSix++;
				preNum = arrList.get(i);

			} else if (arrList.get(i) == 6) {
				preNum = arrList.get(i);
				tempCount = 1;
			} else {
				preNum = 0;
				tempCount = 0;
			}
		}
		return conSix;

	}

	// Counting the number of consecutive 9's
	public static int countsConsecutiveNines(ArrayList<Integer> arrList) {

		int conNine = 0;
		int preNum = 0;
		int tempCount = 0;
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) == preNum) {
				if (tempCount == 1) {
					conNine++;
					tempCount = 0;
				}
				conNine++;
				preNum = arrList.get(i);

			} else if (arrList.get(i) == 9) {
				preNum = arrList.get(i);
				tempCount = 1;
			} else {
				preNum = 0;
				tempCount = 0;
			}
		}
		return conNine;
	}

}
