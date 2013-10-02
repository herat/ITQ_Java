package bit;

/**
 * @File : TwoNonrepeatingNumbers.java
 * @Description : class for finding two non repeating numbers from array
 * @author Mohit
 * 
 */
public class TwoNonrepeatingNumbers {

	/**
	 * Function for finding two non repeating numbers in integer array
	 * 
	 * @param numbers
	 */
	public void findTwoNonrepeatingNumbers(int[] numbers) {
		// variables for two numbers
		int n1 = 0, n2 = 0;
		// variable for storing xor of all numbers
		int xorofNumbers = numbers[0];
		// variable to get right most set bit in xorofNumbers
		int rightmostSetBit = 0;
		// do xor of all numbers
		for (int i = 1; i < numbers.length; i++) {
			xorofNumbers = xorofNumbers ^ numbers[i];
		}
		// get rightmost set bit in xorofNumbers
		rightmostSetBit = xorofNumbers & ~(xorofNumbers - 1);
		// get two numbers
		/*
		 * Divide elements in two sets by comparing rightmost set bit of xor
		 * with bit at same position in each element.
		 */
		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] & rightmostSetBit) > 0) {
				n1 = n1 ^ numbers[i];
			} else {
				n2 = n2 ^ numbers[i];
			}
		}

		System.out
				.println("Two non repeating numbers are " + n1 + " and " + n2);
	}

	public static void main(String[] args) {
		// array of integers
		int[] numbers = { 2, 3, 5, 4, 8, 10, 32, 4, 2, 3, 8, 32 };
		// create object of TwononrepeatingNumbers
		TwoNonrepeatingNumbers twoNonrepeatingNumbers = new TwoNonrepeatingNumbers();
		// find and print two numbers
		twoNonrepeatingNumbers.findTwoNonrepeatingNumbers(numbers);
	}

}
