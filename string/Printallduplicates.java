package string;

/**
 * @File : Printallduplicates.java
 * @Description : Class for printing all duplicates with count
 * @author Mohit
 * 
 */
public class Printallduplicates {

	private String str;
	public static final int TOTALCOUNT = 256;

	public Printallduplicates(String str) {
		this.str = str;
	}

	/**
	 * Function for finding and printing all duplicates
	 */
	public void findandPrintDuplicates() {
		// character array to store count
		int[] charactersCount = new int[TOTALCOUNT];
		// variable for storing characters
		char[] characters = this.str.toCharArray();
		// if string is not empty
		if (this.str.length() > 0) {
			// store count for all characters in string
			for (int i = 0; i < characters.length; i++) {
				charactersCount[characters[i]] = charactersCount[characters[i]] + 1;
			}
			//print characters with count
			for (int i = 0; i < TOTALCOUNT; i++) {
				if(charactersCount[i]>1){
					System.out.println((char)i+" : "+charactersCount[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// String for storing string
		String string = "InterviewQuestionsApplication";
		// create object of Printallduplicates
		Printallduplicates printallduplicates = new Printallduplicates(string);
		// find and print all duplicates
		System.out.println("Duplicates with count :");
		printallduplicates.findandPrintDuplicates();
	}

}
