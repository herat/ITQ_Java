package bit;

/**
 * @File : RotateBits.java
 * @Description : class for rotating bits of number to left or right
 * @author Mohit
 * 
 */
public class RotateBits {

	public static final int TOTALBITS = 32;

	/**
	 * In n<<d, last d bits are 0. To put first 3 bits of n at last, do bitwise
	 * or of n<<d with n >>(INT_BITS - d)
	 * 
	 * @param n
	 * @param d
	 * @return
	 */
	public int leftRotation(int n, int d) {
		return ((n << d) | (n >> (TOTALBITS - d)));
	}

	/**
	 * In n>>d, first d bits are 0. To put last 3 bits of at first, do bitwise
	 * or of n>>d with n <<(INT_BITS - d)
	 * 
	 * @param n
	 * @param d
	 * @return
	 */
	public int rightROtation(int n, int d) {
		return ((n >> d) | (n << (TOTALBITS - d)));
	}

	public static void main(String[] args) {
		// given number
		int n = 16;
		// rotation by this number
		int d = 2;

		// create object of RotateBits
		RotateBits rotateBits = new RotateBits();
		// print left rotated number and right rotated number
		System.out.println("Original Number : " + n);
		System.out.println("Left rotation of number by " + d + " is :"
				+ rotateBits.leftRotation(n, d));
		System.out.println("Right rotation of number by " + d + " is :"
				+ rotateBits.rightROtation(n, d));
	}

}
