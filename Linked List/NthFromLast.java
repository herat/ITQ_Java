/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class NthFromLast {
    static int getNthFromLast(int n,LinkedListNode head) {
        if(n < 0 || head == null) return -1;
        LinkedListNode tmp,tmp1;
        tmp = head;
        tmp1 = head;
        int count = 0;
        while(count < n && tmp1 != null){
            tmp1 = tmp1.next;
            count++;
        }
        if(tmp1 == null) return -1;
        while(tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp = tmp.next;
        }
        return tmp.value;
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(15);
        LinkedListNode node3 = new LinkedListNode(12);
        node1.next = node2;
        node2.next = node3;
        System.out.println(getNthFromLast(1, node1));
    }
}
