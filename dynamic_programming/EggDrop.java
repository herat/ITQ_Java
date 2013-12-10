package dynamic_programming;

/**
 * @File : EggDrop.java
 * @Description : Class for finding minimum trials needed to drop n eggs from k
 *              floors
 * @author Mohit
 * 
 */
public class EggDrop {

	public int findMinimumEggDrops(int n, int k) {
		int[][] table = new int[n + 1][k + 1];
		int result = 0;
		// one trial for one floor and zero trial for zero floor
		for (int i = 1; i <= n; i++) {
			table[i][1] = 1;
			table[i][0] = 0;
		}

		// with one egg and k floors, we need k trials
		for (int i = 1; i <= k; i++) {
			table[1][i] = i;
		}

		// fill rest of the entries using optimal sub problems
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= k; j++) {
				table[i][j] = Integer.MAX_VALUE;
				result = 0;
				// consider all droppings from 1st floor to jth floor and find
				// minimum trials using the sub problems
				for (int l = 1; l <= j; l++) {
					result = 1 + Math.max(table[i - 1][l - 1], table[i][j - l]);
					if (result < table[i][j]) {
						table[i][j] = result;
					}
				}
			}
		}
		return table[n][k];
	}

	public static void main(String[] args) {
		// create object of EggDrop
		EggDrop eggDrop = new EggDrop();
		// find and print minimum number of trials
		System.out
				.println("Minimum number of trials in worst case with 2 eggs and 36 floors is : "
						+ eggDrop.findMinimumEggDrops(2, 36));
	}

}
