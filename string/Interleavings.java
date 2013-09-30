package string;

/**
 * @File : Interleavings.java
 * @Description : Class for printing all interleavings of given two strings
 * @author Mohit
 * 
 */
public class Interleavings {

	/**
	 * Function for printing interleavings recursively
	 * 
	 * @param str1
	 * @param str2
	 * @param newstr
	 * @param m
	 * @param n
	 * @param index
	 */
	public void printInterleavingsRecurse(String str1, String str2,
			char[] newstr, int m, int n, int index) {
		// if m and n both are 0, print new string
		if (m == 0 && n == 0) {
			System.out.println(newstr);
		}
		/*
		 * if still we have characters from first string, append first character
		 * from remaining string and recurse with rest
		 */
		if (m > 0) {
			newstr[index] = str1.charAt(0);
			printInterleavingsRecurse(str1.substring(1), str2, newstr, m - 1,
					n, index + 1);
		}
		/*
		 * if still we have characters from second string, append first
		 * character from remaining string and recurse with rest
		 */
		if (n > 0) {
			newstr[index] = str2.charAt(0);
			printInterleavingsRecurse(str1, str2.substring(1), newstr, m,
					n - 1, index + 1);
		}
	}

	/**
	 * Function for printing interleavings
	 * 
	 * @param str1
	 * @param str2
	 */
	public void printInterleavings(String str1, String str2) {

		// allocate memory for new string
		char[] newstr = new char[str1.length() + str2.length()];
		printInterleavingsRecurse(str1, str2, newstr, str1.length(),
				str2.length(), 0);
	}

	public static void main(String[] args) {
		// given two string
		String str1 = "AB";
		String str2 = "CD";
		// create object of Interleavings
		Interleavings interleavings = new Interleavings();
		// call printInterleaving functions
		interleavings.printInterleavings(str1, str2);

	}

}
