package array;

/**
 * @File : LargestSumContiguousSubarray.java
 * @Description : class for finding largest sum of contiguous subarray
 * @author Mohit
 * 
 */
public class LargestSumContiguousSubarray {

	// variable for array
	private int[] a;

	public LargestSumContiguousSubarray(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding largest sum of contiguous subarray
	 * 
	 * @return int
	 */
	public int findMaxSum() {
		// variable for storing max sum
		int maxSoFar = 0;
		// variable for storing sum
		int sum = 0;
		// iterate through all elements of array
		for (int i = 0; i < this.a.length; i++) {
			sum = sum + this.a[i];
			// if sum<0, make it 0 again
			if (sum < 0)
				sum = 0;
			// if sum greater than maxSoFar, make maxSoFar as sum
			else if (sum > maxSoFar)
				maxSoFar = sum;
		}
		return maxSoFar;
	}

	public static void main(String[] args) {

		// initializing array
		int[] a = { 10, -5, 3, -2, -9, 6, 5 };
		LargestSumContiguousSubarray lscs = new LargestSumContiguousSubarray(a);
		int maxsum=lscs.findMaxSum();
		System.out.println("Largest sum of contiguous subarray is : "+maxsum);
	}

}
