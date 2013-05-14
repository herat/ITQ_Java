/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class CheckParity {
    static boolean checkparity(int n) {
        int count = 0;
        while(n != 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        if(count % 2 == 0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        if(checkparity(0)) {
            System.out.println("Odd parity");
        } else {
            System.out.println("Even parity");
        }
    }
}
