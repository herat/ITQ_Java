package bit;

/**
 * @File : PowerofFour.java
 * @Description : class for checking whether number is power of four
 * @author Mohit
 * 
 */
public class PowerofFour {

	/**
	 * Function for checking whether number is power of 4
	 * 
	 * @param n
	 * @return
	 */
	public boolean isPowerofFour(int n) {

		int count = 0;
		// checking only one bit is set
		if ((n & ~(n & (n - 1))) > 0) {
			// calculating number of zeros after set bit
			while (n > 1) {
				n = n >> 1;
				count = count + 1;
			}
		}
		// count is even, number is power of 4
		if (count % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// given numbers
		int n = 64;
		// create object of PowerofFour
		PowerofFour powerofFour = new PowerofFour();
		// checking
		if (powerofFour.isPowerofFour(n)) {
			System.out.println(n + " is power of 4.");
		} else {
			System.out.println(n + " is not power of 4.");
		}

	}

}
