package string;

/**
 * @File : SmallestWIndow.java
 * @Description : Class to find smallest window in first string which contains
 *              all characters of another string
 * @author Mohit
 * 
 */
public class SmallestWindow {

	/**
	 * Function to find smallest window in first string which contains all
	 * characters of another string
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public String findSmallestWindow(String str1, String str2) {
		// table with counter for another string's characters
		int[] needsToFind = new int[256];
		// variable for begin index
		int begin = 0;
		// table with counter for first string's characters
		int[] hasToFind = new int[256];
		// variable for counting similar characters
		int count = 0;
		// variable to store minimum length of window
		int minWindow = Integer.MAX_VALUE;
		int window = 0;
		// variable to store minimum window starting index
		int minWindowIndex = 0;
		for (int i = 0; i < str2.length(); i++) {
			needsToFind[str2.charAt(i)]++;
		}

		// iterate through the first string
		for (int i = 0; i < str1.length(); i++) {
			// if characters is not in needstoFind table, skip
			if (needsToFind[str1.charAt(i)] == 0) {
				continue;
			}
			// increment counter of current character
			hasToFind[str1.charAt(i)]++;
			// increment count variable
			if (hasToFind[str1.charAt(i)] <= needsToFind[str1.charAt(i)]) {
				count++;
			}
			// if count is same as length of second string,check for window
			if (count == str2.length()) {
				// advance begin index as far right as possible,
				// stop when advancing breaks window constraint.
				while (needsToFind[str1.charAt(begin)] == 0
						|| hasToFind[str1.charAt(begin)] > needsToFind[str1
								.charAt(begin)]) {
					if (hasToFind[str1.charAt(begin)] > needsToFind[str1
							.charAt(begin)]) {
						hasToFind[str1.charAt(begin)]--;
					}
					begin++;
				}
				// update minWindow if a minimum length is met
				window = i - begin + 1;
				if (window < minWindow) {
					minWindow = window;
					minWindowIndex = begin;
				}
			}
		}

		return str1.substring(minWindowIndex, minWindowIndex + minWindow);
	}

	public static void main(String[] args) {
		// two strings
		String str1 = "acbbaca";
		String str2 = "aba";
		// create object of SmallestWindow
		SmallestWindow smallestWindow = new SmallestWindow();
		// find and print substring which contains all characters of another
		// string
		System.out
				.println("Substring with minimum window which contains all characters of another string is : "
						+ smallestWindow.findSmallestWindow(str1, str2));

	}

}
