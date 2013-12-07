package dynamic_programming;

/**
 * @File Name : MaxSizeSquareSubMatrix.java
 * @Description : Class for finding maximum size submtrix which contains all
 *              ones using dynamic programming
 * 
 * @author Mohit
 * 
 */
public class MaxSizeSquareSubMatrix {

	public MaxSizeSquareSubMatrix() {

	}

	/**
	 * Function to print max size sub matrix
	 * 
	 * @param matrix
	 */
	public void printMaxSizeSquareSubmatrix(int[][] matrix) {
		int[][] subMatrix = new int[matrix.length][matrix[0].length];
		int maxi, maxj, maxs;

		// construct first row
		for (int i = 0; i < matrix[0].length; i++) {
			subMatrix[0][i] = matrix[0][i];
		}
		// construct first column
		for (int i = 0; i < matrix.length; i++) {
			subMatrix[i][0] = matrix[i][0];
		}

		// construct remaining submatrix
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					subMatrix[i][j] = Math.min(subMatrix[i][j - 1], Math.min(
							subMatrix[i - 1][j], subMatrix[i - 1][j - 1])) + 1;
				} else {
					subMatrix[i][j] = 0;
				}
			}
		}

		// get maxs and using maxs get maxi and maxj
		maxs = subMatrix[0][0];
		maxi = 0;
		maxj = 0;
		for (int i = 0; i < subMatrix.length; i++) {
			for (int j = 0; j < subMatrix[0].length; j++) {
				if (subMatrix[i][j] > maxs) {
					maxs = subMatrix[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		// print sub matrix
		for (int i = maxi; i > maxi - maxs; i--) {
			for (int j = maxj; j > maxj - maxs; j--) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };
		// create object of MaxSizeSquareSubMatrix
		MaxSizeSquareSubMatrix maxSizeSquareSubMatrix = new MaxSizeSquareSubMatrix();
		// print submatrix
		maxSizeSquareSubMatrix.printMaxSizeSquareSubmatrix(matrix);

	}

}
