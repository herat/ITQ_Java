package dynamic_programming;

public class Knansack {

	public int findMaxvalue(int[] v, int[] w, int W) {
		int[][] K = new int[v.length + 1][W + 1];
		for (int i = 0; i <= v.length; i++) {
			for (int j = 0; j <= W; j++) {
				if (i == 0 || j == 0)
					K[i][j] = 0;
				else if (w[i - 1] <= j)
					K[i][j] = Math.max(v[i - 1] + K[i - 1][j - w[i - 1]],
							K[i - 1][j]);
				else
					K[i][j] = K[i - 1][j];
			}
		}

		return K[v.length][W];
	}

	public static void main(String[] args) {
		int[] v = { 10, 40, 30, 50 };
		int[] w = { 5, 4, 6, 3 };
		int W = 10;
		Knansack knansack = new Knansack();
		System.out.println("Maximum Value : " + knansack.findMaxvalue(v, w, W));

	}

}
