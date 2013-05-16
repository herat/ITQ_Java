package array;
/**
 * @File : FindFirstandSecondSmallest.java
 * @Description : class for finding first and second smallest numbers from array 
 * @author Mohit
 *
 */
public class FindFirstandSecondSmallest {

	// variable for array
	private int[] a;

	public FindFirstandSecondSmallest(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding first and second smallest numbers
	 */
	public void findandPrint() {
		int first, second;
		if (this.a.length < 2) {
			System.out.println("Arry should have more than 2 elements.");
		} else {
			// initialize both numbers to max value of integer
			first = second = Integer.MAX_VALUE;
			for (int i = 0; i < this.a.length; i++) {
				// if current number is less than first, change both first and
				// second
				if (this.a[i] < first) {
					second = first;
					first = this.a[i];
					// if current number is less that second, change second
					// number 
				} else if (this.a[i] < second) {
					second = this.a[i];
				}
			}
			System.out.println("First and Second smallest numbers are : "
					+ first + " " + second);
		}
	}

	public static void main(String[] args) {
		// initializing array
		int[] a = { 10, -5, 3, -2, -9, 6, 5 };
		// create object of FindFirstandSecondSmallest
		FindFirstandSecondSmallest findFirstandSecondSmallest = new FindFirstandSecondSmallest(
				a);
		// find and print first and second smallest numbers
		findFirstandSecondSmallest.findandPrint();

	}

}
