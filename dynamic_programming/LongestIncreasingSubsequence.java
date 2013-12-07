package dynamic_programming;

/**
 * @File Name: LongestIncreasingSubsequence.java
 * @Description : Class for finding longest increasing subsequence using dynamic
 *              programming
 * @author Mohit
 * 
 */
public class LongestIncreasingSubsequence {

	public LongestIncreasingSubsequence() {

	}

	/**
	 * function for finding longest increasing subsequence from the given array
	 * 
	 * @param arr
	 * @return
	 */
	public int findLongestIncreasingSubsequenceSize(int[] arr) {
		// initialize temporary array to 1
		int[] lis = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			lis[i] = 1;
		}

		// increase lis[i] if it is greater than any of the lis from starting to
		// i and arr[i] also greater than arra[j]
		for (int i = 1; i < lis.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		// get max list
		int maxlis = lis[0];
		for (int i = 1; i < lis.length; i++) {
			if (lis[i] > maxlis) {
				maxlis = lis[i];
			}
		}
		return maxlis;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		System.out.println("Longest increasing subsequence size is : "
				+ longestIncreasingSubsequence
						.findLongestIncreasingSubsequenceSize(arr));
	}

}
