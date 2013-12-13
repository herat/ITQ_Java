package array;

/**
 * @File : MaxDiffBetweenTwoElements.java
 * @Description : Class for finding the maximum difference between two elements
 * @author Mohit
 * 
 */
public class MaxDiffBetweenTwoElements {

	/**
	 * Function to find Maximum difference between elements
	 * 
	 * @param arr
	 * @return
	 */
	public int findMaxDiff(int[] arr) {
		// if length of array is greater than 2
		if (arr.length > 2) {
			// get max diff between first two elements
			int maxDiff = arr[1] - arr[0];
			// get minimum value
			int minValue = arr[0];
			// iterate through remaining elements and get maxDiff
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] - minValue > maxDiff) {
					maxDiff = arr[i] - minValue;
				}
				if (arr[i] < minValue) {
					minValue = arr[i];
				}
			}
			return maxDiff;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 80, 100 };
		// create object of MaxDiffBetweenTwo Elements
		MaxDiffBetweenTwoElements maxDiffBetweenTwoElements = new MaxDiffBetweenTwoElements();
		// find max difference between two elements
		System.out.println("Maximum difference : "
				+ maxDiffBetweenTwoElements.findMaxDiff(arr));

	}

}
