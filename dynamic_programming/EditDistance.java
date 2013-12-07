package dynamic_programming;

/**
 * @File Name : EditDistance.java
 * @Description : Class for finding minimum edit(delete, insert and replace)
 *              distance to convert one string to another
 * @author Mohit
 * 
 */
public class EditDistance {

	/**
	 * Function to find minimum edit distance to convert one string to another
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int findMinEditDistance(String str1, String str2) {
		// create matrix for storing distances
		int[][] dist = new int[str1.length() + 1][str2.length() + 1];
		// for first column and all rows, distance would be i as convert from
		// empty string to given string requires i insertions
		for (int i = 0; i <= str1.length(); i++) {
			dist[i][0] = i;
		}
		// for first row and all columns, distance would be i as convert from
		// empty string to given string requires i insertions
		for (int i = 0; i <= str2.length(); i++) {
			dist[0][i] = i;
		}
		// calculate distance using given formula
		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				// if characters at i-1 and j-1 are same,copy distance value
				// from upper diagonal
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dist[i][j] = dist[i - 1][j - 1];
				} else {
					// if different take minimum of three distances
					dist[i][j] = Math.min(dist[i - 1][j - 1],
							Math.min(dist[i][j - 1], dist[i - 1][j])) + 1;
				}
			}
		}
		// return last cell
		return dist[str1.length()][str2.length()];
	}

	public static void main(String[] args) {
		String str1 = "fred";
		String str2 = "bread";
		// create object of EditDistance
		EditDistance editDistance = new EditDistance();
		// find and print minimum distance
		System.out.println("Minimum distance to convert from " + str2 + " to "
				+ str1 + " is : "
				+ editDistance.findMinEditDistance(str1, str2));
	}

}
