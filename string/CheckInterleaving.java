package string;

/**
 * @File : CheckInterleavings.java
 * @Description : Class for checking whether a given string is an interleaving
 *              of two other given strings
 * @author Mohit
 * 
 */
public class CheckInterleaving {

	/**
	 * Function for checking whether a given string is an interleaving of two
	 * other given strings
	 * 
	 * @param str
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean checkInterleavings(String str, String str1, String str2) {
		// initialize three length variables
		int len1 = 0;
		int len2 = 0;
		int len = 0;
		// iterate through all characters of given string
		while (len < str.length()) {
			/*
			 * if current character match to the current character of first
			 * string,increment len1
			 */
			if (len1<str1.length() && (str.charAt(len) == str1.charAt(len1))) {
				len1 = len1 + 1;
				/*
				 * if current character match to the current character of second
				 * string,increment len2
				 */
			} else if (len2<str2.length() && str.charAt(len) == str2.charAt(len2)) {
				len2 = len2 + 1;
				// no match return false
			} else {
				return false;
			}
			// increment len
			len = len + 1;

		}
		// check if str1 and str2 have no more characters
		if (len1 != str1.length() || len2 != str2.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "ACBD";
		String str1 = "AB";
		String str2 = "CD";
		CheckInterleaving checkInterleaving = new CheckInterleaving();
		if (checkInterleaving.checkInterleavings(str, str1, str2)) {
			System.out.println(str + " is an interleaving of " + str1 + " and "
					+ str2);
		} else {
			System.out.println(str + " is not an interleaving of " + str1
					+ " and " + str2);
		}
	}

}
