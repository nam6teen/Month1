package com.example.posneg;

public class TestController {

	public static void main(String[] args) {

		// Test case 1:
		boolean result1 = PosNeg.posNeg(1, -1, false);
		boolean expected1 = true;
		if (result1 == expected1) {
			System.out
					.println("posNeg(1, -1, false)  expected-->" + expected1 + "  result-->" + result1 + " ***PASS***");
		} else {
			System.out
					.println("posNeg(1, -1, false)  expected-->" + expected1 + "  result-->" + result1 + " ***FAIL***");
		}

		// Test case 2:
		boolean result2 = PosNeg.posNeg(-1, 1, false);
		boolean expected2 = true;
		if (result2 == expected2) {
			System.out
					.println("posNeg(-1, 1, false)  expected-->" + expected2 + "  result-->" + result2 + " ***PASS***");
		} else {
			System.out
					.println("posNeg(-1, 1, false)  expected-->" + expected2 + "  result-->" + result2 + " ***FAIL***");
		}

		// Test case 3:
		boolean result3 = PosNeg.posNeg(1, 1, false);
		boolean expected3 = false;
		if (result3 == expected3) {
			System.out
					.println("posNeg(1, 1, false)  expected-->" + expected3 + "  result-->" + result3 + " ***PASS***");
		} else {
			System.out
					.println("posNeg(1, 1, false)  expected-->" + expected3 + "  result-->" + result3 + " ***FAIL***");
		}

		// Test case 4:
		boolean result4 = PosNeg.posNeg(-1, -1, false);
		boolean expected4 = false;
		if (result4 == expected4) {
			System.out.println(
					"posNeg(-1, -1, false)  expected-->" + expected4 + "  result-->" + result4 + " ***PASS***");
		} else {
			System.out.println(
					"posNeg(-1, -1, false)  expected-->" + expected4 + "  result-->" + result4 + " ***FAIL***");
		}

		// Test case 5:
		boolean result5 = PosNeg.posNeg(-1, -1, true);
		boolean expected5 = true;
		if (result5 == expected5) {
			System.out
					.println("posNeg(-1, -1, true)  expected-->" + expected5 + "  result-->" + result5 + " ***PASS***");
		} else {
			System.out
					.println("posNeg(-1, -1, true)  expected-->" + expected5 + "  result-->" + result5 + " ***FAIL***");
		}

		// Test case 6:
		boolean result6 = PosNeg.posNeg(-1, 1, true);
		boolean expected6 = false;
		if (result6 == expected6) {
			System.out
					.println("posNeg(-1, 1, true)  expected-->" + expected6 + "  result-->" + result6 + " ***PASS***");
		} else {
			System.out
					.println("posNeg(-1, 1, true)  expected-->" + expected6 + "  result-->" + result6 + " ***FAIL***");
		}

		// Test case 7:
		boolean result7 = PosNeg.posNeg(1, 1, true);
		boolean expected7 = false;
		if (result7 == expected7) {
			System.out.println("posNeg(1, 1, true)  expected-->" + expected7 + "  result-->" + result7 + " ***PASS***");
		} else {
			System.out.println("posNeg(1, 1, true)  expected-->" + expected7 + "  result-->" + result7 + " ***FAIL***");
		}
		
		// Test case 8:
				boolean result8 = PosNeg.posNeg(1, -1, true);
				boolean expected8 = false;
				if (result8 == expected8) {
					System.out.println("posNeg(1, -1, true)  expected-->" + expected7 + "  result-->" + result7 + " ***PASS***");
				} else {
					System.out.println("posNeg(1, -1, true)  expected-->" + expected7 + "  result-->" + result7 + " ***FAIL***");
				}

	}

}
