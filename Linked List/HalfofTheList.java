/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class HalfofTheList {
    static int halfofthelist(LinkedListNode node) {
        LinkedListNode slow = node;
        LinkedListNode fast = node.next;
        while(fast != null) {
            if(fast.next == null)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(15);
        LinkedListNode node3 = new LinkedListNode(12);
        LinkedListNode node4 = new LinkedListNode(-1);
        LinkedListNode node5 = new LinkedListNode(-2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(halfofthelist(node1));
    }
}
