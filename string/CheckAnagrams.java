package string;

/**
 * @File : CheckAnagrams.java
 * @Description : Class for checking whether a given two strings are anagrams of
 *              each other
 * @author Mohit
 * 
 */
public class CheckAnagrams {

	public static final int TOTALCOUNT = 256;

	/**
	 * Function for checking whether two given strings are anagrams of each
	 * other or not
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean checkAnagrams(String str1, String str2) {

		// initialize count array
		int[] count = new int[TOTALCOUNT];
		// if both strings length are different ,return false
		if (str1.length() != str2.length())
			return false;
		/*
		 * for each character in first string increment count for that character
		 * and for each character in second string decrement count for that
		 * character
		 */
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		// check each character count is not equal to 0
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		// given two strings
		String str1 = "dog";
		String str2 = "god";
		// create object of CheckAnagrams
		CheckAnagrams checkAnagrams = new CheckAnagrams();
		// check anagrams
		if (checkAnagrams.checkAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

}
