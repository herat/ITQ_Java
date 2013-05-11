/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */

import java.util.*;

public class DetectCycle {
    
    static boolean decision;
    
    static boolean DFS_Detect_Cycle(WeightedNode startNode, ArrayList<WeightedNode> visited,ArrayList<WeightedNode> visiting) {
        if(visiting.contains(startNode)) {
            decision = true;
            return true;
        }
        if(startNode != null && !visited.contains(startNode)) {
//            System.out.println(startNode.label);
            visited.add(startNode);
            visiting.add(startNode);
            if(!startNode.adjacencyList.isEmpty()) {
                for(WeightedNode n : startNode.adjacencyList.keySet()) {
                    DFS_Detect_Cycle(n,visited,visiting);
                }
            }
            visiting.remove(startNode);
        }
        return decision;
    }
    
    public static void main(String[] args) {
        WeightedNode node1 = new WeightedNode("1");
        WeightedNode node2 = new WeightedNode("2");
        WeightedNode node3 = new WeightedNode("3");
        WeightedNode node4 = new WeightedNode("4");
        WeightedNode node5 = new WeightedNode("5");
        WeightedNode node6 = new WeightedNode("6");
        WeightedNode node7 = new WeightedNode("7");
        WeightedNode node8 = new WeightedNode("8");
        
        node1.adjacencyList.put(node2, 3.0f);
        node1.adjacencyList.put(node3, 2.0f);
        node1.adjacencyList.put(node4, 5.0f);
        
        //node2.adjacencyList.put(node1, 3.0f);
        node2.adjacencyList.put(node4, 2.0f);
        node2.adjacencyList.put(node6, 13.0f);
        
        //node3.adjacencyList.put(node1, 2.0f);
        node3.adjacencyList.put(node4, 2.0f);
        node3.adjacencyList.put(node5, 5.0f);
        
        //node4.adjacencyList.put(node1, 5.0f);
        //node4.adjacencyList.put(node2, 2.0f);
        //node4.adjacencyList.put(node3, 2.0f);
        node4.adjacencyList.put(node5, 4.0f);
        node4.adjacencyList.put(node6, 6.0f);
        node4.adjacencyList.put(node7, 3.0f);
        
        //node5.adjacencyList.put(node3, 5.0f);
        //node5.adjacencyList.put(node4, 4.0f);
        node5.adjacencyList.put(node7, 6.0f);
        
        //node6.adjacencyList.put(node2, 13.0f);
        //node6.adjacencyList.put(node4, 6.0f);
        node6.adjacencyList.put(node7, 2.0f);
        node6.adjacencyList.put(node8, 3.0f);
        
        //node7.adjacencyList.put(node4, 3.0f);
        //node7.adjacencyList.put(node5, 6.0f);
        //node7.adjacencyList.put(node6, 2.0f);
        node7.adjacencyList.put(node8, 6.0f);
        
        //node8.adjacencyList.put(node6, 3.0f);
        //node8.adjacencyList.put(node7, 6.0f);
        
        if(DFS_Detect_Cycle(node1,new ArrayList<WeightedNode>(), new ArrayList<WeightedNode>())) {
            System.out.println("Graph has the cycle");
        } else {
            System.out.println("Graph does not have the cycle");
        }
    }    
}
