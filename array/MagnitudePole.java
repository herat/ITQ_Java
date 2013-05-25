package array;

import java.util.BitSet;

/**
 * @File : MagnitudePole.java
 * @Description : Find the magnitude pole of array,A magnitude pole of an array
 *              A consisting of N integers is an index K such that all elements
 *              with smaller indexes have values lower or equal to A[K] and all
 *              elements with greater indexes have values greater or equal to
 *              A[K]
 * @author Mohit
 * 
 */
public class MagnitudePole {

	// variable for array
	private int[] a;

	public MagnitudePole(int[] a) {
		this.a = a;
	}

	/**
	 * Function for getting magnitude pole of array
	 * 
	 * @return index as magnitude pole
	 */
	public int findMagnitudePole() {
		// variable for storing max and min of array
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// variable for storing size of array
		int size = this.a.length;

		// one bitset for setting bits for max values and second setting bits
		// for min values
		BitSet b1 = new BitSet(size);
		BitSet b2 = new BitSet(size);
		// finding max and if next value is greater than current max,change max
		// value and set that bit in bitset
		for (int i = 0; i < size; ++i) {
			if (this.a[i] >= max) {
				b1.set(i);
				max = this.a[i];
			}
		}

		// finding min and if next value is less than current min,change min
		// value and set that bit in bitset
		for (int i = size - 1; i >= 0; --i) {
			if (this.a[i] <= min) {
				b2.set(i);
				min = this.a[i];
			}
		}
		// do and to get common set bits
		b1.and(b2);
		System.out.println(b1.toString());
		return b1.nextSetBit(0);
	}

	public static void main(String[] args) {
		// initialize array
		int[] a = { 3, 2, 1, 4, 1, 5, 10, 6, 7, 8 };
		// variable for storing magnitude pole
		int index;
		// create object of MagnitudePole
		MagnitudePole magnitudePole = new MagnitudePole(a);
		// finding magnitude pole
		index = magnitudePole.findMagnitudePole();
		// printing magnitude pole value
		System.out.println("Magnitude Pole of array is : " + index);
	}

}
