package array;

/**
 * @File : ReverseArrayIterative.java
 * @Description : Class for reversing array using recursive method
 * @author Mohit
 * 
 */
public class ReverseArrayRecursive {

	// variable for array
	private int[] array;

	public ReverseArrayRecursive(int[] a) {
		// initializing array
		this.array = a;
	}

	/**
	 * Function for reversing array recursively
	 */
	public void reverseArray(int start, int end) {

		// temporary variable
		int t;
		
		if (start >= end) {
			return;
		}
		// reverse the array using swapping
		t = this.array[end];
		this.array[end] = this.array[start];
		this.array[start] = t;
		reverseArray(start + 1, end - 1);
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
		// initializing start index
		int start = 0;
		// initializing end index
		int end = a.length - 1;
		// creating object of reverseArrayRecursive
		ReverseArrayRecursive reverseArrayRecursive = new ReverseArrayRecursive(a);
		// printing original array
		System.out.println("Original Array :");
		reverseArrayRecursive.printArray(a);
		// call reverseArray method for reversing array
		reverseArrayRecursive.reverseArray(start, end);
		// printing reversed array
		System.out.println("Reveresed Array :");
		reverseArrayRecursive.printArray(a);
	}

}
