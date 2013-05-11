/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
import java.util.ArrayList;

class Node {
    String label;
    public ArrayList<Node> adjacencyList;
    
    Node(String label) {
        this.label = label;
        this.adjacencyList = new ArrayList<Node>();
    }
}