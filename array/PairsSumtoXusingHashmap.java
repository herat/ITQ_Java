package array;

/**
 * @File : PairsSumtoXusingHashmap.java
 * @Description : Class for finding pairs in array which sum to x
 * @author Mohit
 * 
 */

public class PairsSumtoXusingHashmap {

	//constant for max hashmap values
	public static final int MAX = 1000;
	//variable for array
	private int[] a;
	//variable for sum
	private int x;

	public PairsSumtoXusingHashmap(int[] a, int x) {
		//initialize a variable
		this.a = a;
		//initialize x variable
		this.x = x;
	}

	/**
	 * Function for finding pair and print that pair
	 */
	public void findandPrintPairs() {
		// temporary variable
		int t;
		// hash map
		byte[] map = new byte[MAX];
		// finding pair
		for (int i = 0; i < this.a.length; i++) {
			t = this.x - this.a[i];
			// if t >0 and map[t] == 1, there is a pair
			if (t >= 0 && map[t] == 1) {
				System.out.println("Pair : " + t + " and " + this.a[i]);
			}
			// set to 1 in hashmap for that index
			map[this.a[i]] = 1;
		}
	}

	public static void main(String[] args) {
		// initialize array
		int[] a = { 10, 20, 14, 25, 16, 40 };
		// initialize sum
		int x = 30;
		// create object of PairsSumtoXusingHashmap
		PairsSumtoXusingHashmap pairsSumtoXusingHashmap = new PairsSumtoXusingHashmap(a, x);
		// call findandPrintPairs method for finding and printing pairs
		pairsSumtoXusingHashmap.findandPrintPairs();
	}

}
