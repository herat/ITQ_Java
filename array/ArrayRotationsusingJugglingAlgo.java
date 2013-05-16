package array;

/**
 * @File : ArrayRotationusingJugglingAlgo.java
 * @Description : class for rotating array using juggling algorithm
 * @author Mohit
 * 
 */
public class ArrayRotationsusingJugglingAlgo {

	// variable for array
	private int[] a;

	public ArrayRotationsusingJugglingAlgo(int[] a) {
		// initialize a variable
		this.a = a;
	}

	/**
	 * Function for rotating array by n
	 * @param n
	 */
	public void rotate(int n) {
		// get GCD of array length and rotation factor
		int gcd = getGCD(this.a.length, n);
		// temporary variable to store first element
		int t;
		// other temporary variable to jump from one element to other by n
		int t1;
		int t2;
		for (int i = 0; i < gcd; i++) {
			// getting first element of first part
			t = this.a[i];
			t1 = i;
			// doing jump from one index to other by n
			while (true) {
				// moving forward by n
				t2 = t1 + n;
				// if t2 reach end of the array
				if (t2 >= this.a.length)
					t2 = t2 - this.a.length;
				if (t2 == i)
					break;
				// put number at t2 into t1
				this.a[t1] = this.a[t2];
				// move t1 to t2
				t1 = t2;
			}
			// finally set last element ot first element
			this.a[t1] = t;
		}
	}

	/**
	 * Function for getting GCD of n1 and n2
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public int getGCD(int n1, int n2) {
		if (n2 == 0)
			return n1;
		else
			return getGCD(n2, n1 % n2);
	}

	/**
	 * Function for printing array
	 * 
	 * @param a
	 */
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// initialize array
		int[] a = { 10, 20, 14, 25, 16, 40 };
		// initialize sum
		int n = 2;
		ArrayRotationsusingJugglingAlgo jugglingAlgo = new ArrayRotationsusingJugglingAlgo(
				a);
		// printing original array
		System.out.println("Original Array :");
		jugglingAlgo.printArray(a);
		// calling rotate function
		jugglingAlgo.rotate(n);
		// printing reversed array
		System.out.println("Rotated Array by " + n + " : ");
		jugglingAlgo.printArray(a);

	}

}
