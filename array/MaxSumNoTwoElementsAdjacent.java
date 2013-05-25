package array;

/**
 * @File : MaxSumNoTwoElementsAdjacent.java
 * @Description : Find maximum sum such that no two elements are adjacent
 * @author Mohit
 * 
 */
public class MaxSumNoTwoElementsAdjacent {

	// variable for array
	private int[] a;

	public MaxSumNoTwoElementsAdjacent(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding maximum sum where two elements are not adjacent
	 * 
	 * @return
	 */
	public int findSum() {
		int includesum = this.a[0];
		int excludesum = 0;
		int excludesumNew = 0;
		for (int i = 1; i < this.a.length; i++) {
			// current max excluding current element
			if (includesum > excludesum) {
				excludesumNew = includesum;
			} else {
				excludesumNew = excludesum;
			}

			// current max including current element
			includesum = excludesum + this.a[i];
			excludesum = excludesumNew;
		}

		// return max of includesum and excludesum
		return Math.max(includesum, excludesum);
	}

	public static void main(String[] args) {
		// initialize array
		int[] a = { 10, 20, 14, 25, 16, 40 };
		int sum;
		// create object of MaxSumNoTwoElementsAdjacent
		MaxSumNoTwoElementsAdjacent maxSumNoTwoElementsAdjacent = new MaxSumNoTwoElementsAdjacent(
				a);
		// get max sum
		sum = maxSumNoTwoElementsAdjacent.findSum();
		// print sum
		System.out.println("Max Sum : " + sum);
	}

}
