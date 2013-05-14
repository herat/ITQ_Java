/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class GetOddOccurance {
    static int getOccurance(int[] array) {
        int result = 0;
        for(int i=0;i<array.length;i++) {
            result ^= array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getOccurance(new int[]{1,2,3,1,2,3,3}));
    }
}
