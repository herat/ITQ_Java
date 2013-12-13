package array;

/**
 * @File : MaxProductSubArray.java
 * @Description : Class for finding maximum product subarray
 * @author Mohit
 * 
 */
public class MaxProductSubArray {

	/**
	 * Function for finding the maximum product subarray
	 * 
	 * @param arr
	 * @return
	 */
	public int findMaxProductSubArray(int[] arr) {
		// initialize variables
		int maxEndingHere = 1;
		int minEndingHere = 1;
		int maxProductSoFar = 1;

		for (int i = 0; i < arr.length; i++) {
			// if arr[i]> greater than 0, maxEndingHere=maxEndingHere*arr[i],
			// and minEndingHere update only when minEndingHere is negative
			if (arr[i] > 0) {
				maxEndingHere = maxEndingHere * arr[i];
				minEndingHere = Math.min(minEndingHere * arr[i], 1);
				// if array element 0, both set to 1
			} else if (arr[i] == 0) {
				maxEndingHere = 1;
				minEndingHere = 1;
				// if negative, maxEndingHere is updated only if minEndingHere
				// is negative
				// and minEndingHere is previous maxEndingHere*arr[i]
			} else {
				int temp = maxEndingHere;
				maxEndingHere = Math.max(minEndingHere * arr[i], 1);
				minEndingHere = temp * arr[i];
			}
			//get maxSumSoFar
			if (maxEndingHere > maxProductSoFar) {
				maxProductSoFar = maxEndingHere;
			}
		}
		return maxProductSoFar;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
		// create object of MaxProductSubArray
		MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
		System.out.println("Maximum product of subarray :"
				+ maxProductSubArray.findMaxProductSubArray(arr));

	}

}
