package string;

/**
 * @File : CheckWords.java
 * @Description : Class for finding words from list which contain all characters
 *              of given string
 * @author Mohit
 * 
 */
public class CheckWords {

	public static final int TOTALCOUNT = 256;

	/**
	 * Function for printing all words from list which contains all characters
	 * of given words
	 * 
	 * @param str1
	 * @param list
	 */
	public void printStrings(String str1, String[] list) {
		// variable for storing given string characters count
		int[] hashTable = new int[TOTALCOUNT];
		// variable for storing length of string in list
		int len = 0;

		if (str1.length() > 0 && list.length > 0) {
			// iterate over all strings of list
			for (int j = 0; j < list.length; j++) {
				// create hashtable for every string
				for (int i = 0; i < str1.length(); i++) {
					hashTable[str1.charAt(i)] = 1;
				}
				// set len to 0
				len = 0;
				// iterate over word characters
				for (int i = 0; i < list[j].length(); i++) {
					// if particular word is present in hashtable, increment len
					// and set hashtable value of particular character to 0
					if (hashTable[list[j].charAt(i)] == 1) {
						len = len + 1;
						hashTable[list[j].charAt(i)] = 0;

					}
					// if len is equal to length of given string, print that
					// word
					if (len == str1.length()) {
						System.out.println(list[j]);
						break;
					}
				}
			}

		}
	}

	public static void main(String[] args) {

		// given string
		String string = "hen";
		// given list of strings
		String[] list = { "hello", "eee", "length", "mechanical" };
		// create object of CheckWords
		CheckWords checkWords = new CheckWords();
		// print words from list which contains all characters of given word
		checkWords.printStrings(string, list);

	}

}
