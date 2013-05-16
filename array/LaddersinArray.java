package array;

/**
 * @File : LaddersinArray.java
 * @Description : class for finding ladders in array, an element is ladder, if
 *              it is greater than all right most elements
 * @author Mohit
 * 
 */
public class LaddersinArray {

	// variable for array
	private int[] a;

	public LaddersinArray(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for finding and printing ladders, The best way to do it, iterate
	 * array from right side
	 */
	public void findLaddersandPrint() {
		int maxSoFar;

		if (this.a.length > 0) {
			System.out.println("Ladders in Array : ");
			// right most element
			maxSoFar = this.a[this.a.length - 1];
			// right most element is always ladder
			System.out.print(maxSoFar + " ");
			for (int i = this.a.length - 2; i >= 0; i--) {
				// if current element is greater that maxSoFar, print that and
				// change maxSoFar with current Element
				if (this.a[i] > maxSoFar) {
					System.out.print(this.a[i] + " ");
					maxSoFar = this.a[i];
				}
			}
		}
	}

	public static void main(String[] args) {
		// initializing array
		int[] a = { 10, -5, 3, -2, -9, 6, 5 };
		//create object of LaddersinArray
		LaddersinArray laddersinArray = new LaddersinArray(a);
		//find ladders and print
		laddersinArray.findLaddersandPrint();

	}

}
