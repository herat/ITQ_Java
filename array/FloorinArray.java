package array;

/**
 * @File : FloorinArray.java
 * @Description : Class for finding floor value in an array
 * @author Mohit
 * 
 */
public class FloorinArray {

	/**
	 * Function to get floor value of given number in an array
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @param number
	 * @return
	 */
	public int getFloorValue(int[] arr, int start, int end, int number) {
		// base case
		if (start > end) {
			return -1;
		}
		// if number less than start, no number found
		if (number < arr[start]) {
			return -1;
		}
		// if number is greater than end index number ,return last number
		if (number >= arr[end]) {
			return end;
		}
		// get mid value
		int mid = (start + end) / 2;
		// if mid is same as number, return mid
		if (arr[mid] == number) {
			return mid;
			// if number is less than mid number
		} else if (arr[mid] > number) {
			// if number is between mid and mid-1 numbers ,return mid-1
			if (mid - 1 >= start && arr[mid - 1] < number) {
				return mid - 1;
				// else search first part
			} else {
				return getFloorValue(arr, start, mid - 1, number);
			}
			// if number is greater than mid number
		} else {
			// if number is between mid and mid+1 numbers , return mid
			if (mid + 1 <= end && arr[mid + 1] > number) {
				return mid;
				// search second part
			} else {
				return getFloorValue(arr, mid + 1, end, number);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
		int number = 5;
		// create object of FloorinArray
		FloorinArray floorinArray = new FloorinArray();
		// get index of floor value
		int index = floorinArray.getFloorValue(arr, 0, arr.length - 1, number);
		// print floor value
		if (index == -1) {
			System.out.println("No floor value found.");
		} else {
			System.out.println("Floor value of " + number + " is : "
					+ arr[index]);
		}

	}

}
