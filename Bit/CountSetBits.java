package bit;

/**
 * @File : CountSetBits.java
 * @Description : class for counting set bits in any number
 * @author Mohit
 * 
 */
public class CountSetBits {

	/**
	 * Function for calculating set bits by sifting every bit
	 * @param n
	 * @return
	 */
	public int countSetBits1(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count = count + 1;
			}
			n = n >> 1;
		}
		return count;
	}

	/**
	 * Function for calculating set bits by removing right most set bit
	 * @param n
	 * @return
	 */
	public int countSetBits2(int n) {
		int count = 0;
		while (n > 0) {
			count = count + 1;
			n = n & n - 1;
		}
		return count;
	}

	public static void main(String[] args) {
		//given number 
		int n = 55;
		//create object of CountSetBits
		CountSetBits countSetBits = new CountSetBits();
		//printing set bits using two different ways
		
		System.out.println("Set bits : " + countSetBits.countSetBits1(n));
		System.out.println("Set bits : " + countSetBits.countSetBits2(n));
	}

}
