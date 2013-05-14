/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class OverflowCheck {
    static int sum(int a,int b) {
        if(a > Integer.MAX_VALUE - b) 
            return -1;
        else
            return a+b;
    }
    public static void main(String[] args) {
        int result = sum(Integer.MAX_VALUE,1);
        System.out.println(result);
    }
}
