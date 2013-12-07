package dynamic_programming;

/**
 * @File Name : MinJumps.java Description : Class for finding minimum jumps from
 *       start to end in an array
 * @author Mohit
 * 
 */
public class MinJumps {

	/**
	 * function for finding minimum jumps from start to end in an array
	 * 
	 * @param arr
	 * @return
	 */
	public int findMinJumps(int[] arr) {
		int[] jumps = new int[arr.length];
		if (arr.length == 0 || arr[0] == 0) {
			return -1;
		}
		jumps[0] = 0;

		for (int i = 1; i < arr.length; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = jumps[j] + 1;
				}
			}
		}
		return jumps[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 1, 0, 9 };
		// create object of MinJumps
		MinJumps minJumps = new MinJumps();
		// find and print minimum jumps
		System.out.println("Minimum jumps required to go from start to end :"
				+ minJumps.findMinJumps(arr));
	}

}
