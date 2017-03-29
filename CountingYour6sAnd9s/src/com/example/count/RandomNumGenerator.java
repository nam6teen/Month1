package com.example.count;

/**
 * Returns a Collection of a stream of random numbers lying between 1 and 100
 * 
 * Namita Anand
 * 8 March 2017
 * CountingYour6sAnd9s Project
 */
import java.util.ArrayList;
import java.util.Random;

public class RandomNumGenerator {

	public static ArrayList<Integer> randomNumGenerator() {
		final int MIN = 1, MAX = 100, SIZE = 10000000;
		Random random = new Random();

		ArrayList<Integer> randomNum = new ArrayList<Integer>();

		for (int i = 0; i < SIZE; i++) {
			randomNum.add(MIN + (random.nextInt(MAX - MIN + 1)));
		}

		return randomNum;
	}
}
