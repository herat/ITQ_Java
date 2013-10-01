package string;

/**
 * @File : LongestPalindrome.java
 * @Description : Class for finding longest palindrome substring in a given
 *              string
 * @author Mohit
 * 
 */

public class LongestPalindrome {

	/**
	 * Function for finding longest palindromic substring
	 * 
	 * @param str
	 * @return
	 */
	public String findLongestPalindromicSubstring(String str) {
		int len = str.length();
		// create auxiliary table
		boolean[][] table = new boolean[len][len];
		// variable for startindex of longest palindromic substring
		int startIndex = 0;
		// variable for max length of palindromic substring
		int maxLength = 0;
		// one character substrings are palindrome
		for (int i = 0; i < len; i++) {
			table[i][i] = true;
		}

		// create entry in table for two characters palindromic substring
		for (int i = 0; i < len - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				table[i][i + 1] = true;
				startIndex = i;
				maxLength = 2;
			}
		}

		// create entry for more than 3 characters palindromic substring
		for (int i = 3; i <= len; i++) {
			// check for all length i substrings from starting index j
			for (int j = 0; j < len - i + 1; j++) {
				// get end index of substring starting at j and length of i
				int k = j + i - 1;
				/*
				 * checking if substring j+1 to k-1 is palindromic substring and
				 * character at j and k are same
				 */
				if (table[j + 1][k - 1] && str.charAt(j) == str.charAt(k)) {
					table[j][k] = true;
					/*
					 * if k is greater than maxlength, change start index and
					 * maxlength
					 */
					if (k > maxLength) {
						startIndex = j;
						maxLength = i;
					}
				}
			}
		}
		// return substring starting at startIndex with length of maxlength
		return str.substring(startIndex, startIndex + maxLength);
	}

	public static void main(String[] args) {
		// given string
		String str = "abcdefedcghijihgcdebc";
		// create object of LongestPalindrome
		LongestPalindrome longestPalindrome = new LongestPalindrome();
		System.out.println("Original String : " + str);
		// find longest Palindrome
		System.out.println("Longest Palindrome : "
				+ longestPalindrome.findLongestPalindromicSubstring(str));

	}

}
