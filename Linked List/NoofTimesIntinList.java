/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class NoofTimesIntinList {
    static int nooftimes(int n, LinkedListNode head) {
        if(head == null) return -1;
        LinkedListNode tmp = head;
        int count = 0;
        while(tmp != null) {
            if(tmp.value == n)
                count++;
            tmp = tmp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(15);
        LinkedListNode node3 = new LinkedListNode(10);
        node1.next = node2;
        node2.next = node3;
        System.out.println(nooftimes(10, node1));
    }
}
