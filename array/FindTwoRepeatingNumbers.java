package array;

/**
 * @File : FindTwoRepeatingNumbers.java
 * @Description : Class for finding two repeating numbers in an array using XOR
 *              method
 * @author Mohit
 * 
 */
public class FindTwoRepeatingNumbers {

	/**
	 * Function to get two repeating numbers in an array
	 * 
	 * @param arr
	 */
	public void getTwoRepeatingNumbers(int[] arr) {
		// xor of all numbers
		int xor = arr[0];
		int size = arr.length;
		int n = size - 1;
		// Will have only single set bit of xor
		int setBits = 0;
		int x = 0, y = 0;
		// Get the xor of all elements in arr[] and {1, 2 .. n}
		for (int i = 1; i < size; i++) {
			xor = xor ^ arr[i];
		}
		for (int i = 1; i < n; i++) {
			xor = xor ^ i;
		}
		// Get the rightmost set bit in set_bit_no
		setBits = xor & ~(xor - 1);
		// Now divide elements in two sets by comparing rightmost set
		// bit of xor with bit at same position in each element.
		for (int i = 0; i < size; i++) {
			if ((arr[i] & setBits) > 0) {
				// XOR of first set in arr[]
				x = x ^ arr[i];
			} else {
				// XOR of second set in arr[]
				y = y ^ arr[i];
			}
		}
		for (int i = 1; i < n; i++) {

			if ((i & setBits) > 0) {
				// XOR of first set in arr[] and {1, 2, ...n }
				x = x ^ i;
			} else {
				// XOR of second set in arr[] and {1, 2, ...n }
				y = y ^ i;
			}
		}
		System.out.println("Two repeating numbers are : " + x + " and " + y);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 4, 5, 2, 3, 1 };
		// Create object of FindTwoRepeatingNumbers
		FindTwoRepeatingNumbers findTwoRepeatingNumbers = new FindTwoRepeatingNumbers();
		// get and print two repeating numbers
		findTwoRepeatingNumbers.getTwoRepeatingNumbers(arr);

	}

}
