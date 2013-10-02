package bit;

/**
 * @File : Multiplywith3andhalf.java
 * @Description : class for multiplying any integer with 3.5
 * @author Mohit
 * 
 */
public class Multiplywith3andhalf {

	/**
	 * function for multiplying any integer with 3.5
	 * 
	 * @param n
	 * @return
	 */
	public int multiply(int n) {
		// doing n*2 + n + n/2
		return (n << 1) + n + (n >> 1);
	}

	public static void main(String[] args) {
		// given number
		int n = 7;
		// create object of Multiplywith3and half
		Multiplywith3andhalf multiplywith3andhalf = new Multiplywith3andhalf();
		// multiply
		System.out.println("Multiplication of " + n + " with 3.5 is :"
				+ multiplywith3andhalf.multiply(n));

	}

}
