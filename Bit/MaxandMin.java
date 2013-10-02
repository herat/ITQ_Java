package bit;

/**
 * @File : MaxandMin.java
 * @Description : class for finding max and min of two numbers without branching
 * @author Mohit
 * 
 */
public class MaxandMin {

	/**
	 * Function for finding min of two numbers
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public int findMin(int n1, int n2) {
		int temp = 0;
		if (n1 > n2) {
			temp = 1;
		}
		return n2 ^ ((n1 ^ n2) & ~(temp));
	}

	/**
	 * function for finding max of two numbers
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public int findMax(int n1, int n2) {
		int temp = 0;
		if (n1 > n2) {
			temp = 1;
		}
		return n1 ^ ((n1 ^ n2) & ~(temp));
	}

	public static void main(String[] args) {
		int n1 = 24;
		int n2 = 35;
		MaxandMin maxandMin = new MaxandMin();
		System.out.println("Minimum of " + n1 + " and " + n2 + " is : "
				+ maxandMin.findMin(n1, n2));
		System.out.println("Maximum of " + n1 + " and " + n2 + " is : "
				+ maxandMin.findMax(n1, n2));

	}

}
