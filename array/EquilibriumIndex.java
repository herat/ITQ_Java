package array;

/**
 * @file : EquilibriumIndex.java @ Description : Class for finding equilibrium
 *       index in an array,equilibrium index means the index where the sum of
 *       right and left sides subarrays
 * @author Mohit
 * 
 */
public class EquilibriumIndex {

	/**
	 * Function to get equilibrium Index of an array
	 * 
	 * @param arr
	 * @return
	 */
	public int getequilibriumIndex(int[] arr) {
		// variable to store sums
		int leftsum = 0;
		int sum = 0;
		// get whole array sum
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			// sum is now right sum of index i
			sum = sum - arr[i];
			// if leftsum and sum are equal ,return that index
			if (leftsum == sum) {
				return i;
			}

			leftsum = leftsum + arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		// create object of EquilibriumIndex
		EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
		// get equilibrium index of array
		System.out.println("Equilibrium Index of this array is : "
				+ equilibriumIndex.getequilibriumIndex(arr));
	}

}
