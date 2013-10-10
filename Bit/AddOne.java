package bit;

/**
 * @File : AddOne.java
 * @Description : class for adding one to any integer
 * @author Mohit
 * 
 */
public class AddOne {

	/**
	 * Function for adding one to any number
	 * 
	 * @param n
	 * @return
	 */
	public int addone(int n) {
		int m = 1;
		// change all right most set bits to 0 till right most 0
		while ((n & m) > 1) {
			n = n ^ m;
			m = m << 1;
		}
		// change rightmost 0 to one
		n = n ^ m;
		return n;
	}

	public static void main(String[] args) {
		// given number
		int n = 14;
		System.out.println("Original Number : " + n);
		// create object of AddOne
		AddOne addOne = new AddOne();
		// add one to given number
		System.out.println("After adding one : " + addOne.addone(n));

	}

}
