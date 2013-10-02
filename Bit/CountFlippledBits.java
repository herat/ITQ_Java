package bit;

/**
 * @File : CountFlippedBits.java
 * @Description : class for counting number of bits needs to be flipped to
 *              convert one number to another
 * @author Mohit
 * 
 */
public class CountFlippledBits {

	/**
	 * Function to count flipped bits using xor
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public int flippledBits(int n1, int n2) {

		return countSetBits(n1 ^ n2);
	}

	/**
	 * Function for calculating set bits by removing right most set bit
	 * 
	 * @param n
	 * @return
	 */
	public int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n = n & n - 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// given two numbers
		int n1 = 73;
		int n2 = 21;
		// create object of CountFlippedBits
		CountFlippledBits countFlippledBits = new CountFlippledBits();
		// print number of bits
		System.out
				.println(" Number of bits needs to be flipped to convert number "
						+ n1
						+ " to "
						+ n2
						+ " : "
						+ countFlippledBits.flippledBits(n1, n2));

	}

}
