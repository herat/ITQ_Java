package string;

/**
 * @File : MaxOccurredCharacter.java
 * @Description : Class for finding maximum occurring character in string
 * @author Mohit
 * 
 */
public class MaxOccurredCharacter {

	private String str;
	public static final int TOTALCOUNT = 256;

	public MaxOccurredCharacter(String str) {
		this.str = str;
	}

	/**
	 * Function for finding the character which occurred maximum number of times
	 * 
	 * @return
	 */
	public char findCharacter() {
		// character array to store count
		int[] charactersCount = new int[TOTALCOUNT];
		// variable for storing characters
		char[] characters = this.str.toCharArray();
		// variable to store character which occurred max number of times
		char maxcharacter = 0;
		int maxindex = 0;
		// if string is not empty
		if (this.str.length() > 0) {
			// store count for all characters in string
			for (int i = 0; i < this.str.length(); i++) {
				charactersCount[characters[i]] = charactersCount[characters[i]] + 1;
			}
			// found index of character which is occurred maximum number if
			// times
			for (int i = 0; i < TOTALCOUNT; i++) {
				if (charactersCount[i] > charactersCount[maxindex]) {
					maxindex = i;
				}
			}

			maxcharacter = (char) maxindex;
		}

		return maxcharacter;
	}

	public static void main(String[] args) {
		// String for storing string
		String string = "Interview Questions Application";
		// create object of MaxOccurredCharacter
		MaxOccurredCharacter maxOccurredCharacter = new MaxOccurredCharacter(
				string);
		// print character
		System.out.println("The character which occurred maximum times is : "
				+ maxOccurredCharacter.findCharacter());
	}

}
