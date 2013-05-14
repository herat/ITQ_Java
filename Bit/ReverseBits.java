/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class ReverseBits {
    static int sizeofInt() {
        int i = 1, j = 0;
        while (i != 0) {
            i =  (i<<1); j++;
        }
        return j;
    }
    static int reverseBits(int num) {
        int count = sizeofInt() * 8 - 1;
        int reverse_num = num;

        num >>= 1; 
        while(num != 0)
        {
           reverse_num <<= 1;       
           reverse_num |= num & 1;
           num >>= 1;
           count--;
        }
        reverse_num <<= count;
        return reverse_num;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }
}
