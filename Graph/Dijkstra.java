/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */

import java.util.*;

public class Dijkstra {
    static void dijkstra(int[][] graph, int source) {
        if(graph == null)
            return;
        
        ArrayList<Integer> sptSet = new ArrayList<Integer>();
               
        int[] dist = new int[graph.length];
        for(int i=0;i<dist.length;i++) {
            if(i == source) {
                dist[i] = 0;
            } else {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        int min_dist,min_vertex = -1;
        while(sptSet.size() != graph.length) {
            min_dist = Integer.MAX_VALUE;
            for(int j=0;j<dist.length;j++) {
                if(!sptSet.contains(j) && dist[j] < min_dist) {
                    min_dist = dist[j];
                    min_vertex = j;
                }
            }
            sptSet.add(min_vertex);
            for(int k=0;k<dist.length;k++) {
                if(graph[min_vertex][k] != 0 && !sptSet.contains(k) && dist[min_vertex] != Integer.MAX_VALUE && dist[k] > dist[min_vertex] + graph[min_vertex][k] ) {
                    dist[k] = dist[min_vertex] + graph[min_vertex][k];
                }
            }
        }
        
        System.out.println("---Distances---");
        for(int i=0;i<dist.length;i++) {
            System.out.println(i+"\t"+dist[i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                      {0, 0, 8, 0, 0, 0, 0, 11, 0},
                      {0, 8, 0, 7, 0, 4, 0, 0, 2},
                      {0, 0, 7, 0, 9, 14, 0, 0, 0},
                      {0, 0, 0, 9, 0, 10, 0, 0, 0},
                      {0, 0, 4, 0, 10, 0, 2, 0, 0},
                      {0, 0, 0, 14, 0, 2, 0, 1, 6},
                      {8, 11, 0, 0, 0, 0, 1, 0, 7},
                      {0, 0, 2, 0, 0, 0, 6, 7, 0}
                     };
 
        dijkstra(graph, 0);
    }
}
