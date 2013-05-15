package array;

/**
 * @File : MajorityElement.java
 * @Description : Class for finding majority element in array
 * @author Mohit
 * 
 */
public class MajorityElement {
	// variable for array
	private int[] a;

	public MajorityElement(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding element that can be majority element
	 * 
	 * @return int
	 */
	public int findMajorityElement() {
		// variable for majority element index
		int index = 0;
		// variable for counting majority elements
		int count = 0;
		// find the element index that can be majority element
		for (int i = 1; i < this.a.length; i++) {
			if (this.a[index] == this.a[i]) {
				count = count + 1;
			} else {
				count = count - 1;
			}
			// if count==0 change index to current index and set count to 1
			if (count == 0) {
				index = i;
				count = 1;
			}
		}
		// return element that can be majority element
		return this.a[index];
	}

	/**
	 * Function for checking found element is majority element or not
	 * 
	 * @param value
	 * @return
	 */
	public boolean isMajorityElement(int value) {
		int count = 0;
		// count total count of majority element
		for (int i = 0; i < this.a.length; i++) {
			if (this.a[i] == value) {
				count = count + 1;
			}
		}
		// if count > length/2, it is majority element
		if (count > this.a.length / 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// initialize array
		int[] a = { 10, 20, 10, 20, 10, 10 };
		// variable for getting majority element
		int element;
		// create object of MajorityElement
		MajorityElement majorityElement = new MajorityElement(a);
		// find majority element
		element = majorityElement.findMajorityElement();
		// check that found element is majority element or not
		if (majorityElement.isMajorityElement(element)) {
			System.out.println("Majority element is : " + element);
		} else {
			System.out.println("No majority element present in this array.");
		}
	}

}
