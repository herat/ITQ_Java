package array;

/**
 * @File : ReverseArrayIterative.java
 * @Description : Class for reversing array using iterative method
 * @author Mohit
 * 
 */
public class ReverseArrayIterative {

	// variable for array
	private int[] array;

	public ReverseArrayIterative(int[] a) {
		// initializing array
		this.array = a;
	}

	/**
	 * Function for reversing array
	 */
	public void reverseArray() {
		// initializing start index
		int start = 0;
		// initializing end index
		int end = this.array.length - 1;
		// temporary variable
		int t;
		// reverse the array using swapping
		while (start <= end) {
			t = this.array[end];
			this.array[end] = this.array[start];
			this.array[start] = t;
			start++;
			end--;
		}
	}

	/**
	 * Function for printing array
	 * 
	 * @param a
	 */
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// initializing array
		int[] a = { 1, 2, 3, 4, 6, 7 };
		// creating object of reverseArrayIterative
		ReverseArrayIterative reverseArrayIterative = new ReverseArrayIterative(a);
		// printing original array
		System.out.println("Original Array :");
		reverseArrayIterative.printArray(a);
		// call reverseArray method for reversing array
		reverseArrayIterative.reverseArray();
		// printing reversed array
		System.out.println("Reveresed Array :");
		reverseArrayIterative.printArray(a);
	}

}
