package array;

/**
 * @File : SearchinSortedPivotedArray.java
 * @Description : Class for finding number in sorted and pivoted array
 * @author Mohit
 * 
 */
public class SearchinSortedPivotedArray {

	/**
	 * Function for finding number in sorted and pivoted Array
	 * 
	 * @param arr
	 * @param number
	 * @return
	 */
	public int pivotBinarySearch(int[] arr, int number) {
		// get pivot index
		int pivot = findPivot(arr, 0, arr.length - 1);

		// if no pivot index, array is not rotated
		if (pivot == -1) {
			return binarySearch(arr, 0, arr.length - 1, number);
		}
		// if number is same as pivoted index number, return that number
		if (arr[pivot] == number) {
			return pivot;
		}
		// search in first and second part
		if (arr[0] <= number) {
			return binarySearch(arr, 0, pivot - 1, number);
		} else {
			return binarySearch(arr, pivot + 1, arr.length - 1, number);
		}
	}

	/**
	 * Function to find pivot point where array is being rotated
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public int findPivot(int[] arr, int start, int end) {
		// base cases
		if (start > end) {
			return -1;
		}
		if (start == end) {
			return start;
		}
		// get mid index
		int mid = (start + end) / 2;
		// if mid index less than end and arr[mid]>arr[mid+1],return mid
		if (mid < end && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		// if arr[mid]<arr[mid-1], return mid-1
		if (mid > start && arr[mid] < arr[mid - 1]) {
			return mid - 1;
		}
		// if arr[start]>=arr[mid] ,search in first part
		if (arr[start] >= arr[mid]) {
			return findPivot(arr, start, mid - 1);
			// search in second part
		} else {
			return findPivot(arr, mid + 1, end);
		}
	}

	/**
	 * Function to do binary search
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @param number
	 * @return
	 */
	public int binarySearch(int[] arr, int start, int end, int number) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == number) {
			return mid;
		}
		if (number > arr[mid]) {
			return binarySearch(arr, mid + 1, end, number);
		} else {
			return binarySearch(arr, start, mid - 1, number);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
		int number = 6;
		// create object of SearchinSortedPivotedArray
		SearchinSortedPivotedArray searchinSortedPivotedArray = new SearchinSortedPivotedArray();
		// get index of number
		int index = searchinSortedPivotedArray.pivotBinarySearch(arr, number);
		if (index == -1) {
			System.out.println("Number not present in Array.");
		} else {
			System.out.println("Number " + number + " found at index : "
					+ index);
		}
	}

}
