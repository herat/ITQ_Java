package array;

/**
 * @File : RotateMatrix.java
 * @Description : Class to rotate Matrix
 * @author Mohit
 *
 */
public class RotateMatrix {

	/**
	 * Function to rotate matrix
	 * @param matrix
	 */
	public void rotatematrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			System.out.println("Matrix is not square matrix.");
			System.exit(1);
		}

		printMatrix(matrix);
		int m = matrix.length;
		int temp = 0;
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - 1 - i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[m - 1 - j][i];
				matrix[m - 1 - j][i] = matrix[m - 1 - i][m - 1 - j];
				matrix[m - 1 - i][m - 1 - j] = matrix[j][m - 1 - i];
				matrix[j][m - 1 - i] = temp;

			}
		}
		System.out.println();
		System.out.println("Rotated Matrix :");
		printMatrix(matrix);
	}

	/**
	 * Function to print matrix
	 * @param matrix
	 */
	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 12, 34, 345, 13, 66 }, { 3, 43, 55, 36, 76 },
				{ 12, 4, 5, 67, 47 }, { 65, 34, 32, 21, 84 },
				{ 36, 85, 63, 72, 91 } };
		// create object of RotateMatrix
		RotateMatrix rotateMatrix = new RotateMatrix();
		// rotate matrix
		rotateMatrix.rotatematrix(matrix);
	}
}
