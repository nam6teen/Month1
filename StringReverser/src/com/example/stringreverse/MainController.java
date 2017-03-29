package com.example.stringreverse;

/**
 * The MainController program reverses the strings stored in str1 and str2 using the 
 * method reverse(String stringToBeReversed) and stores the results in reverse1 and 
 * reverse2,respectively. str1 is reversed using the implementation that doesn't 
 * use recursion and the string str2 uses the implementation that involves recursion. 
 * 
 * @author Namita Anand
 * @since 5 Mar 2017 
 * StringReverser Project
 */
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! Please enter a string to be reversed:");
		String str1 = scanner.nextLine();
		StringReverserWithoutRecursion srwor = new StringReverserWithoutRecursion();
		String reverse1 = srwor.reverse(str1);
		System.out.println("String-->" + str1 + " Reverse(without recursion)-->" + reverse1);

		System.out.println("Enter another string to be reversed: ");
		String str2 = scanner.nextLine();
		StringReverserWithRecursion srwr = new StringReverserWithRecursion();
		String reverse2 = srwr.reverse(str2);
		System.out.println("String-->" + str2 + " Reverse(with recursion)-->" + reverse2);
	}

}
