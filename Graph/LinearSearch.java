/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class LinearSearch {
    static boolean linearSearch(int []array, int element) {
        if(array == null) {
            return false;
        }
        for(int i=0;i<array.length;i++) {
            if(array[i] == element) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {-1,2,0,4,3};
        if(linearSearch(array, 3)) {
            System.out.println("Element exists.");
        } else {
            System.out.println("Element does not exist.");
        }
    }
}
