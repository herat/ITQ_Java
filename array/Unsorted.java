package array;

/**
 * @File : Unsorted.java
 * @Description : Given an unsorted array arr[0..n-1] of size n, find the
 *              minimum length subarray arr[s..e] such that sorting this
 *              subarray makes the whole array sorted.
 * 
 * @author Mohit
 * 
 */
public class Unsorted {
	/**
	 * Function for getting unsorted subarray
	 * @param arr
	 */
	public void getandPrintUnsortedSubArray(int[] arr) {
		int leftMax = 0;
		int rightMin = arr.length - 1;
		int min, max;

		// get leftMax index
		for (int i = 1; i < arr.length; i++) {
			if (arr[leftMax] > arr[i]) {
				break;
			}
			leftMax = i;
		}
		if (leftMax == arr.length - 1) {
			System.out.println("Array is already sorted.");
			System.exit(0);
		}
		// get Rightmin index
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[rightMin] < arr[i]) {
				break;
			}
			rightMin = i;
		}
		min = max = arr[leftMax];
		// get min and max in subarray of leftMax and RightMin
		for (int i = leftMax; i <= rightMin; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// get index of element in subarray[0,..leftMax] which is greater than
		// min value
		for (int i = 0; i <= leftMax; i++) {
			if (arr[i] > min) {
				leftMax = i;
				break;
			}
		}
		// get index of element in subarray[RightMin,...] which is less than max
		// value
		for (int i = arr.length - 1; i >= rightMin; i--) {
			if (arr[i] < max) {
				rightMin = i;
				break;
			}
		}

		System.out.println("Usorted Array is : ");
		for (int i = leftMax; i <= rightMin; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 32, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		// create object of Unsorted
		Unsorted unsorted = new Unsorted();
		// get and print unsorted subarray
		unsorted.getandPrintUnsortedSubArray(arr);
	}

}
