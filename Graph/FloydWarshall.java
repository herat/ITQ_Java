/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */
public class FloydWarshall {
    static void floydwarshall(int [][] graph) {
        int i,j,k;
        for(k=0;k<graph.length;k++) {
            for(i=0;i<graph.length;i++) {
                for(j=0;j<graph.length;j++) {
                    if(graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        for(i=0;i<graph.length;i++) {
                for(j=0;j<graph.length;j++) {
                    System.out.print(graph[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        int graph[][] = { {0,   5,  9999, 10},
                        {9999, 0,   3, 9999},
                        {9999, 9999, 0,   1},
                        {9999, 9999, 9999, 0}
                      };
        floydwarshall(graph);
    }
}
