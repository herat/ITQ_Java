/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
import java.util.*;

public class Traversal {
    
    static void BFS(ArrayList<Node> queue, int index) {
        if(queue != null) {
            Node startNode = queue.get(index);
            System.out.println(startNode.label);
            if(!startNode.adjacencyList.isEmpty()) {
                for(Node n : startNode.adjacencyList) {
                    if(!queue.contains(n)) {
                        queue.add(n);
                    }
                }
                BFS(queue,index+1);
            }
        }
    }
    
    static void DFS(Node startNode, ArrayList<Node> visited) {
        if(startNode != null && !visited.contains(startNode)) {
            System.out.println(startNode.label);
            visited.add(startNode);
            if(!startNode.adjacencyList.isEmpty()) {
                for(Node n : startNode.adjacencyList) {
                    DFS(n,visited);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        
        node1.adjacencyList.add(node2);
        node1.adjacencyList.add(node3);
        node2.adjacencyList.add(node4);
        node3.adjacencyList.add(node4);
        node4.adjacencyList.add(node5);
        
        System.out.println("-----DFS-----");
        DFS(node1,new ArrayList<Node>());
        ArrayList<Node> queue = new ArrayList<Node>();
        queue.add(node1);
        System.out.println("-----BFS-----");
        BFS(queue,0);
    }
}
