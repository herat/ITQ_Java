/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class PositionofRightMost1 {
    static int positionofRightMost1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            if((n & 1) == 1)
                break;
            n = n >> 1;            
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(positionofRightMost1(19));
    }
}
