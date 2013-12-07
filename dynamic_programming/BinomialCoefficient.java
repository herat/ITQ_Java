package dynamic_programming;

/**
 * @File Name : BinomialCoefficient.java
 * @Description : Class for finding Binomial Coefficient of given n and k
 * @author Mohit
 * 
 */
public class BinomialCoefficient {

	/**
	 * Function to find binomial Coefficient of given n and k
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public int findBinomialCoefficient(int n, int k) {
		int[][] C = new int[n + 1][k + 1];
		// Calculate value of Binomial Coefficient in bottom up manner
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				// Base Cases
				if (j == 0 || j == i)
					C[i][j] = 1;

				// Calculate value using previously stored values
				else
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
			}
		}

		return C[n][k];
	}

	public static void main(String[] args) {
		BinomialCoefficient binomialCoefficient = new BinomialCoefficient();
		System.out.println("Binomial Coefficient of n=5 and k=2 is : "
				+ binomialCoefficient.findBinomialCoefficient(5, 2));

	}

}
