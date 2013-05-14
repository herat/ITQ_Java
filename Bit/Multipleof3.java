/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class Multipleof3 {
    static boolean isMultipleof3(int n) {
        int odd = 0,even = 0;
        if(n < 0)   n = -n;
        if(n == 0) return true;
        if(n == 1) return false;
        while(n!=0) {
            if((n & 1) == 1) {
                odd++;
            }
            n = n >> 1;
            if((n & 1) == 1) {
                even++;
            }
            n = n >> 1;
        }
        return isMultipleof3(Math.abs(odd-even));
    }
    public static void main(String[] args) {
        if(isMultipleof3(1)) {
            System.out.println("Multiple of 3");
        } else {
            System.out.println("Not multiple of 3");
        }
    }
}
