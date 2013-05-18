/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class ReverseList {
    static LinkedListNode reverseList(LinkedListNode head) {
        if(head == null)
            return null;
        LinkedListNode new_head = head;
        LinkedListNode tmp;
        LinkedListNode prev = new_head.next;
        new_head.next = null;
        while(prev != null) {
            tmp = prev.next;
            prev.next = new_head;
            new_head = prev;
            prev = tmp;
        }
        return new_head;
    }
    static void printList(LinkedListNode node) {
        if(node == null) return;
        LinkedListNode tmp = node;
        while(tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(12);
        LinkedListNode node3 = new LinkedListNode(15);
        node1.next = node2;
        node2.next = node3;
        node1 = reverseList(node1);
        printList(node1);
    }
}
