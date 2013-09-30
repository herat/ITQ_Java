package string;

/**
 * @File : ReverseWordsinString.java
 * @Description : Class for reversing words in given string
 * @author Mohit
 * 
 */

public class ReverseWordsinString {

	/**
	 * Function for reversing words in string
	 * 
	 * @param str
	 * @return
	 */
	public String reverseWords(String str) {
		// variable for storing temporary string
		String tempString = "";
		// variable for storing index of starting word
		int index = 0;
		// find individual word and reverse word and create new string
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				tempString += reverse(str.substring(index, i)) + " ";
				// tempString+=reverseWord(str.substring(index,i))+" ";
				index = i + 1;
			}
		}
		// reverse last word and append to new string

		tempString += reverse(str.substring(index));
		// tempString+=reverseWord(str.substring(index));

		// reverse whole new temporary string
		return reverse(tempString);
		// return reverseWord(tempString);
	}

	/**
	 * helper function to reverse string using stringbuilder
	 * 
	 * @param str
	 * @return
	 */
	public String reverseWord(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	/**
	 * helper function to reverse string using recursion
	 * 
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}

		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// given string
		String str = "This is interview questions App";
		// create object of ReverseWordsinString
		ReverseWordsinString reverseWordsinString = new ReverseWordsinString();
		// printing original string
		System.out.println("Original String : " + str);
		// printing reversed string
		System.out.println("Reversed String : "
				+ reverseWordsinString.reverseWords(str));

	}

}
