/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */

import java.util.*;

public class WeightedNode {
    String label;
    public HashMap<WeightedNode,Float> adjacencyList;
    
    WeightedNode(String label) {
        this.label = label;
        this.adjacencyList = new HashMap<WeightedNode,Float>();
    }    
}
