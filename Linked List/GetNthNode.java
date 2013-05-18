/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class GetNthNode {
    static int getNthNode(int n, LinkedListNode head) {
        if(n < 0) {
            return -1;
        }
        int count = 0;
        LinkedListNode tmp = head;
        while(count < n && tmp != null) {
            count++;
            tmp = tmp.next;
        }
        if(tmp == null || count < n) {
            return -1;
        }
        return tmp.value;
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(15);
        LinkedListNode node3 = new LinkedListNode(12);
        node1.next = node2;
        node2.next = node3;
        System.out.println(getNthNode(0,node1));
    }
}
