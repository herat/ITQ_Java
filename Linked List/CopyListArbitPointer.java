/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class CopyListArbitPointer {
    static void copyList(ArbitNode head) {
        ArbitNode tmp = head;
        ArbitNode t;
        while(tmp != null) {
            t = new ArbitNode(tmp.value);
            t.next = tmp.next;
            tmp.next = t;
            t.arbit = tmp.arbit;
            tmp = (ArbitNode)tmp.next.next;
        }
        ArbitNode head1;
        tmp = (ArbitNode)head.next;
        head1 = (ArbitNode)head.next;
        while(tmp.next != null) {
            tmp.next = tmp.next.next;
            tmp = (ArbitNode)tmp.next;
        }
        
        while(head1!=null) {
            System.out.print(head1.value+" "+head1.arbit.value);
            System.out.println();
            head1 = (ArbitNode)head1.next;
        }
    }
    
    public static void main(String[] args) {
        ArbitNode node1 = new ArbitNode(10);
        ArbitNode node2 = new ArbitNode(12);
        ArbitNode node3 = new ArbitNode(15);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        
        node1.arbit = node3;
        node2.arbit = node1;
        node3.arbit = node2;
        
        copyList(node1);
    }
}
