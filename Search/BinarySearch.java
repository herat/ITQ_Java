/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class BinarySearch {
    static boolean binarySearch(int []array, int element) {
        if(array == null) {
            return false;
        }
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        while(low <= high) {
            middle = (low+high) / 2;
            if(array[middle] == element) {
                return true;
            } else if(array[middle] > element) {
                high = middle - 1;
            } else if(array[middle] < element) {
                low = middle + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {-100,-1,3,4,5};
        if(binarySearch(array, 3)) {
            System.out.println("Element exists.");
        } else {
            System.out.println("Element does not exist.");
        }
    }
}
