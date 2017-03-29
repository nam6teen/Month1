package com.full.demo;

/**
 * The class MainController gets a string from the user which is manipulated by the 
 * overrided methods from MyString class. 
 * 
 * Namita Anand 
 * 11 March 2017 
 * MyStringDemo Project
 *
 */
import java.util.Scanner;

import com.full.implementation.MyString;
import com.full.util.AbstractMyString;

public class MainController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! Please enter a string:");
		String input = scanner.nextLine();

		AbstractMyString str = new MyString(input);

		System.out.println("The entered string is: " + str.toString());
		System.out.println("Length of the entered String:" + str.getLength());
		System.out.println("Reverse of " + str + " : \"" + str.reverse() + "\"");
		System.out.println("Number of vowels in " + str + " :" + str.getVowelsCount());
		System.out.println("Number of consonants in " + str + " :" + str.getConsonantCount());
		System.out.println("Number in capital letters in " + str + " :" + str.getNumCapitalLetters());
		System.out.println("Sum of all characters in " + str + " : " + str.getSumOfAllCharacters());

	}

}
