package array;

/**
 * @File : FindOddOccurrence.java
 * @Description : Class for finding the number which occurs odd number of times
 *              in array
 * @author Mohit
 * 
 */
public class FindOddOccurrence {

	// variable for array
	private int[] a;

	public FindOddOccurrence(int[] a) {
		// initialize a variable
		this.a = a;
	}
	
	/**
	 * Function for getting number with odd occurrence
	 * @return int
	 */
	public int getOddOccurrence() {
		int t = 0;
		//xor with all elements
		for (int i = 0; i < this.a.length; i++) {
			t = t ^ this.a[i];
		}
		return t;
	}

	public static void main(String[] args) {

		// initializing array
		int[] a = { 1, 2, 2, 1, 3, 2, 1, 3, 1 };
		//create object of FindOddOccurrence
		FindOddOccurrence findOddOccurrence = new FindOddOccurrence(a);
		//getting odd occurrence
		int value = findOddOccurrence.getOddOccurrence();
		System.out.println("Number with odd occurrence : " + value);
	}

}
