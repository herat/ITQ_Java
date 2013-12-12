package array;

import java.util.Arrays;

public class MedianinTwoSortedArrays {

	/**
	 * Function to get median of two sorted array of same size
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int getMedian(int[] arr1, int[] arr2) {
		int m1 = 0;
		int m2 = 0;
		//base case
		if (arr1.length <= 0 || arr1.length != arr2.length) {
			return -1;
		}
		//if both have one element, return median of those two elements
		if (arr1.length == 1) {
			return (arr1[0] + arr2[0]) / 2;
		}
		//if both arrays have two-two elements, get median using below formula
		if (arr1.length == 2) {
			return (Math.max(arr1[0], arr2[0]) + Math.min(arr1[1], arr2[1])) / 2;
		}
		//get medians
		m1 = median(arr1);
		m2 = median(arr2);
		//if both medians same ,return
		if (m1 == m2) {
			return m1;
		}
		//if m1<m2,find median in arr1[m1,....] and arr2[0,....,m2]
		if (m1 < m2) {
			if (arr1.length % 2 == 0) {

				return getMedian(Arrays.copyOfRange(arr1, arr1.length / 2,
						arr1.length), Arrays.copyOfRange(arr2, 0,
						arr2.length / 2));
			} else {
				return getMedian(
						Arrays.copyOfRange(arr1, arr1.length / 2, arr1.length),
						Arrays.copyOfRange(arr2, 0, arr2.length / 2+1));
			}
			//m1>m2,find median in arr1[0,...,m1] and arr2[m2,....]
		} else {
			if (arr1.length % 2 == 0) {

				return getMedian(Arrays.copyOfRange(arr2, arr2.length / 2,
						arr2.length), Arrays.copyOfRange(arr1, 0,
						arr1.length / 2));
			} else {
				return getMedian(
						Arrays.copyOfRange(arr2, arr2.length / 2, arr2.length),
						Arrays.copyOfRange(arr1, 0, arr1.length / 2+1));
			}
		}
	}

	/**
	 * Function to get median of sorted array
	 * 
	 * @param arr
	 * @return
	 */
	public int median(int[] arr) {
		if (arr.length % 2 == 0) {
			return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
		} else {
			return arr[arr.length / 2];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 12, 15, 26, 38,40 };
		int[] arr2 = { 2, 13, 17, 30, 45,50 };
		//create object of MedianinTwoSortedArrays
		MedianinTwoSortedArrays medianinTwoSortedArrays = new MedianinTwoSortedArrays();
		//get median
		System.out.println("Median of two sorted arrays is : "
				+ medianinTwoSortedArrays.getMedian(arr1, arr2));
	}

}
