/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */

import java.util.*;

public class HamiltonianCycle {
    static void hamiltoniancycle(int[][] graph) {
        Stack path = new Stack();
        path.push(0);
        
        int prevElement;
        boolean new_added = true;
        while(new_added) {
            new_added = false;
            prevElement = (Integer)path.peek();
            for(int i=0;i<graph[prevElement].length;i++) {
                if(graph[prevElement][i] == 1 && path.search(i) == -1) {
                    new_added = true;
                    path.push(i);
                    break;
                }
            }
        }
        if(path.size() == graph.length && graph[(Integer)path.peek()][0] == 1) {
            System.out.println("Hamilton Cycle Exists.");
            for(Object o : path) {
                System.out.println((Integer)o);
            }
            System.out.println("0");
        } else {
            System.out.println("No Hamilton Cycle Exists.");
        }
    }
    
    public static void main(String[] args) {
        int graph[][] = {{1, 1, 0, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 1, 1, 0, 1},
                      {1, 1, 0, 1, 1},
                      {0, 1, 1, 1, 1},
                     };
        hamiltoniancycle(graph);
    }    
}
