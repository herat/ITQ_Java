package dynamic_programming;

/**
 * @File Name : MinCostPath.java
 * @Description : Class for finding minimum distance from starting cell to
 *              ending cell, we can move only right,down and right diagonal
 * @author Mohit
 * 
 */
public class MinCostPath {

	/**
	 * Function for finding minimum distance from starting cell to ending cell
	 * 
	 * @param costMatrix
	 * @return
	 */
	public int findMinCostPath(int[][] costMatrix) {
		int[][] costMat = new int[costMatrix.length][costMatrix[0].length];
		// initialize first cell
		costMat[0][0] = costMatrix[0][0];
		// initialize first column
		for (int i = 1; i < costMat.length; i++) {
			costMat[i][0] = costMat[i - 1][0] + costMatrix[i][0];
		}
		// initialize first row
		for (int i = 1; i < costMat[0].length; i++) {
			costMat[0][i] = costMat[0][i - 1] + costMatrix[0][i];
		}
		// using formula build remaining matrix
		for (int i = 1; i < costMat.length; i++) {
			for (int j = 1; j < costMat[0].length; j++) {
				costMat[i][j] = Math.min(costMat[i - 1][j],
						Math.min(costMat[i - 1][j - 1], costMat[i][j - 1]))
						+ costMatrix[i][j];
			}
		}
		// return last cell value which is minimum distance
		return costMat[costMatrix.length - 1][costMatrix[0].length - 1];
	}

	public static void main(String[] args) {
		int[][] cost = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

		// create object of MinCostPath
		MinCostPath minCostPath = new MinCostPath();
		// find and print minimum cost value
		System.out
				.println("Minimum cost from starting cell to ending cell is : "
						+ minCostPath.findMinCostPath(cost));
	}

}
