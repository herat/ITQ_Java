/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class DetectLoop {
    static void detectLoop(LinkedListNode head) {
        LinkedListNode fast,slow;
        slow = head;
        fast = slow;
        if(slow == null || fast == null)
            System.out.println("No cycle exists.");
        while(slow != null && fast != null && fast.next != null) {
           
            slow = slow.next;
            fast = fast.next.next;
             if(slow.equals(fast)) {
                System.out.println("Loop exists.");
                return;
            }
        }
        System.out.println("No cycle exists");
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(10);
        LinkedListNode node2 = new LinkedListNode(12);
        LinkedListNode node3 = new LinkedListNode(15);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        detectLoop(node1);
    }
}
