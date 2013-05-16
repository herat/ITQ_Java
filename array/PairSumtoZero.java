package array;

import java.util.Arrays;

/**
 * @File : PairSumtoZero.java
 * @Description : class for finding two elements whose sum is near to zero
 * @author Mohit
 * 
 */
public class PairSumtoZero {

	// variable for array
	private int[] a;

	public PairSumtoZero(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding pair whose sum is near to zero
	 */
	public void findPair() {
		if (this.a.length > 0) {
			// initialize start and end index
			int start = 0, end = this.a.length - 1;
			// initialize minstart index and minend index
			int minstartindex = start, minendindex = end, sum;
			// initialize minsum to integer max value
			int minsum = Integer.MAX_VALUE;
			// sort array
			Arrays.sort(this.a);
			while (start < end) {

				sum = this.a[start] + this.a[end];
				// if absolute sum is less that absolute minsum, change minsum,
				// minstartindex and minendindex
				if (Math.abs(sum) < Math.abs(minsum)) {
					minsum = sum;
					minstartindex = start;
					minendindex = end;
				}
				// if sum becomes less that zero, move start pointer by 1 right
				if (sum < 0) {
					start = start + 1;
					// else end pointer by 1 left
				} else {
					end = end - 1;
				}
			}
			// print both numbers using minstartindex and minendindex
			System.out.println("Pair which sum to zero is : "
					+ this.a[minstartindex] + " " + this.a[minendindex]);
		}
	}

	public static void main(String[] args) {

		// initializing array
		int[] a = { 10, -1, 3, -2, -9, 6, 5 };
		// create object of FindFirstandSecondSmallest
		PairSumtoZero pairSumtoZero = new PairSumtoZero(a);
		// Find pair which sum to zero
		pairSumtoZero.findPair();
	}

}
