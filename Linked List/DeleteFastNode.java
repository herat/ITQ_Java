/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class DeleteFastNode {
    static void deleteFastNode(LinkedListNode node) {
        if(node == null) return;
        LinkedListNode node1 = node.next;
        if(node1 != null) {
            node.next = node1.next;
            node.value = node1.value;
        } else {
            node = null;
        }
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
        LinkedListNode node2 = new LinkedListNode(15);
        LinkedListNode node3 = new LinkedListNode(12);
        node1.next = node2;
        node2.next = node3;
        printList(node1);
        deleteFastNode(node1);
        printList(node1);
    }
}
