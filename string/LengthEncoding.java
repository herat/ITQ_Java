package string;

/**
 * @File : LengthEncoding.java
 * @Description : Class for doing length encoding
 * @author Mohit
 * 
 */
public class LengthEncoding {

	/**
	 * Function for calculating size of compressed String
	 * 
	 * @param str
	 * @return
	 */
	public static int countCompressionLength(String str) {
		// if string is null return 0
		if (str == null || str.isEmpty())
			return 0;

		// get first character
		char last = str.charAt(0);
		// variable for storing length of string
		int length = 0;
		// variable for counting every character occurrence
		int count = 1;
		// iterate string
		for (int i = 1; i < str.length(); i++) {
			// if characters are same increment count
			if (str.charAt(i) == last) {
				count++;
			} else {
				// take next character and calculate new length
				last = str.charAt(i);
				length += 1 + String.valueOf(count).length();
				// set count to 1
				count = 1;
			}
		}
		// calculate new length with last character
		length += 1 + String.valueOf(count).length();
		return length;
	}

	/**
	 * Function for compressing String
	 * 
	 * @param str
	 * @return
	 */
	public String compressString(String str) {
		// calculate the length of compressed string
		int length = countCompressionLength(str);
		// if length is greater than original string length, no need to do
		// compression
		if (length >= str.length()) {
			return str;
		}
		// create object for compressed String
		StringBuffer compressedString = new StringBuffer();
		// get first character
		char last = str.charAt(0);
		// variable for counting every character occurrence
		int count = 1;
		// iterate string
		for (int i = 1; i < str.length(); i++) {
			// if characters are same increment count
			if (str.charAt(i) == last) {
				count++;
			} else {
				// append current character and count of that character
				compressedString.append(last);
				compressedString.append(count);
				// take next character
				last = str.charAt(i);
				// set count to 1
				count = 1;
			}
		}
		// append last character and count of that character
		compressedString.append(last);
		compressedString.append(count);
		return compressedString.toString();
	}

	public static void main(String[] args) {
		// given string
		String str = "aaaabbbbddddccccccccccccccccccceeeefgh";
		// create object of LengthEncoding
		LengthEncoding lengthEncoding = new LengthEncoding();
		// print original string with size
		System.out.println("Original String (size) : " + str + "("
				+ str.length() + ")");
		// do compression
		String compressedString = lengthEncoding.compressString(str);
		// print compressed String with size
		System.out.println("Compressed String (size) : " + compressedString
				+ "(" + compressedString.length() + ")");
	}

}
