package string;

/**
 * @File : LongestSubString.java
 * @Description : Class to find the length of longest substring with no repeated
 *              characters
 * @author Mohit
 * 
 */
public class LongestSubString {

	private String str;
	public static final int TOTALCOUNT = 256;

	public LongestSubString(String str) {
		this.str = str;
	}

	/**
	 * Function for finding length of longest substring with no repeating
	 * characters
	 * 
	 * @return
	 */
	public int findLenghtofLongestSubString() {
		// variable for storing maximum length of substring
		int maxLenght = 1;
		// variable for storing length of current substring
		int currentLength = 1;
		int previousIndex = 0;
		// array to store visited characters
		int[] visited = new int[TOTALCOUNT];
		// variable for storing characters
		char[] characters = this.str.toCharArray();
		// initialize visited array to -1, to keep track of not visited
		// characters
		for (int i = 0; i < TOTALCOUNT; i++) {
			visited[i] = -1;
		}

		// check that string is not empty
		if (this.str.length() > 0) {
			// make first character of string as visited
			visited[characters[0]] = 0;
			// iterate all remaining characters
			for (int i = 1; i < characters.length; i++) {
				// store previous index
				previousIndex = visited[characters[i]];
				/*
				 * if current character is not present in already visited
				 * substring or it is not part of current no repeated characters
				 * string,then increment currentLength by 1
				 */
				if (previousIndex == -1 || i - currentLength > previousIndex) {
					currentLength = currentLength + 1;
					/*
					 * if current character is present in currently considered
					 * no repeated characters string,then start no repeated
					 * characters string from next character of previous
					 * instance
					 */
				} else {
					// also check that if currentLength is greater than
					// maxLength,change maxLength
					if (currentLength > maxLenght) {
						maxLenght = currentLength;
					}
					// change no repeated characters string
					currentLength = i - previousIndex;
				}
				// update index of current character
				visited[characters[i]] = i;
			}

			// compare the length of last no repeated characters string and
			// change maxLength if necessary
			if (currentLength > maxLenght) {
				maxLenght = currentLength;
			}
			return maxLenght;
		}

		return 0;
	}

	public static void main(String[] args) {
		// String for storing string
		String string = "InterviewQuestionsApplication";
		// create object of LongestSubString
		LongestSubString longestSubString = new LongestSubString(string);
		// find and print all duplicates
		System.out
				.println("Length of longest substring with no repeating characters : "
						+ longestSubString.findLenghtofLongestSubString());

	}

}
