package string;

/**
 * @File : CheckRotation.java
 * @Description : Class for checking second string is rotation of first string
 *              or not
 * @author Mohit
 * 
 */
public class CheckRotation {

	public CheckRotation() {

	}

	/**
	 * Function for checking strings are rotation of each other or not
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean areRotation(String str1, String str2) {
		String combinedString = "";
		// if both strings size are same,check for rotation
		if (str1.length() == str2.length()) {
			// create new string with two copies of str1
			combinedString = str1 + str1;
			// check str2 is substring of combined string or not
			if (combinedString.contains(str2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "bcda";
		// create variable of CheckRotation
		CheckRotation checkRotation = new CheckRotation();
		// check that both strings are rotation of each other or not
		if (checkRotation.areRotation(str1, str2)) {
			System.out.println("Strings are rotation of each other.");
		} else {
			System.out.println("Strings are not rotation of each other.");
		}
	}

}
