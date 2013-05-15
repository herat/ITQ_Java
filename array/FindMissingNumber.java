package array;

/**
 * @File : FindMissingNumber.java
 * @Description : Class for finding missing number in array of n-1 numbers range
 *              from 1 to n using XOR
 * @author Mohit
 * 
 */
public class FindMissingNumber {
	//variable for array
	private int[] a;

	public FindMissingNumber(int[] a) {
		// initializing array
		this.a = a;
	}

	/**
	 * Function for getting missing number in array
	 * 
	 * @return int
	 */
	public int getMissingNumber() {
		//variable for missing number
		int missingNumber=0;
		if (this.a.length > 0) {
			// variable for doing xor on all elements of array
			int t1 = this.a[0];
			// variable for doing xor on range
			int t2 = 1;
			
			//xor with all elements
			for (int i = 1; i < a.length; i++) {
				t1=t1^a[i];
			}
			
			//xor with all indexes 1 to n
			for (int i = 2; i <= (a.length+1); i++) {
				t2=t2^i;
			}
			
			missingNumber=t1^t2;
		}
		return missingNumber;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//initializing array
		int [] a={1,2,3,4,6,7};
		//variable for missing number
		int missingNumber;
		//creating object of FindMissingNumber
		FindMissingNumber findMissingNumber=new FindMissingNumber(a);
		//getting missing number
		missingNumber=findMissingNumber.getMissingNumber();
		if(missingNumber==0){
			System.out.println("Array is empty.");
		}
		else{
			System.out.println("Missing Number is : "+missingNumber);
		}
	}

}
