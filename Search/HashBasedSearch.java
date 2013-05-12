/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
class LinkListNode {
    int value;
    LinkListNode next;
}
public class HashBasedSearch {
    static LinkListNode[] createTable(int[] array, int size) {
        if(array == null) {
            return null;
        }
        LinkListNode[] table = new LinkListNode[size];
        int index;
        for(int j=0;j<table.length;j++) {
            table[j] = new LinkListNode();
            table[j].next = null;
            table[j].value = -1;
        }
        for(int i=0;i<array.length;i++) {
            index = Math.abs(array[i] % size);
            if(table[index].next == null) {
                LinkListNode new_node = new LinkListNode();
                new_node.value = array[i];
                new_node.next = null;
                
                table[index].next = new_node;
            } else {
                LinkListNode tmp = table[index];
                while(tmp.next != null) {
                    tmp = tmp.next;
                }
                LinkListNode new_node = new LinkListNode();
                new_node.next = null;
                new_node.value = array[i];
                
                tmp.next = new_node;
            }
        }
        return table;
    }
    
    static boolean hashSearch(LinkListNode[] table, int element,int size) {
        if (table == null)
            return false;
        int index = Math.abs(element % size);
        if(table[index].next == null) {
            return false;
        } else {
            LinkListNode tmp = table[index].next;
            while(tmp != null) {
                if(tmp.value == element)
                    return true;
                tmp = tmp.next;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] array = {0,5,3,-1};
        LinkListNode[] table = createTable(array, 3);
        if(hashSearch(table,-1,3)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
