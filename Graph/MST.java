/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herat
 */

import java.util.*;

public class MST {
    
    public static void printMap(Map<String, Float> map){
            for (Map.Entry entry : map.entrySet()) {
                    System.out.println("Key : " + entry.getKey() 
                               + " Value : " + entry.getValue());
            }
    }
    
    private static Map sortByComparator(HashMap<String,Float> unsortMap) {
 
            List list = new LinkedList(unsortMap.entrySet());

            // sort list based on comparator
            Collections.sort(list, new Comparator() {
                    public int compare(Object o1, Object o2) {
                            return ((Comparable) ((Map.Entry) (o1)).getValue())
                                   .compareTo(((Map.Entry) (o2)).getValue());
                    }
            });

            // put sorted list into map again
            //LinkedHashMap make sure order in which keys were inserted
            Map sortedMap = new LinkedHashMap();
            for (Iterator it = list.iterator(); it.hasNext();) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sortedMap.put(entry.getKey(), entry.getValue());
            }
            return sortedMap;
    }
    
    static void buildMSTKruskal(HashMap<String,Float> edges,HashMap<String,WeightedNode> graph) {
        if(edges == null) 
            return;
        HashMap<String,Float> newedges = new HashMap<String,Float>();
        HashMap<String,Integer> vertexset = new HashMap<String,Integer>();
        for(String s : graph.keySet()) {
            vertexset.put(s, Integer.parseInt(s));
        }
        String[] parts;
        int newmin = 0;
        int oldmin = -1;
        for(String s: edges.keySet()) {
            parts = s.split(" ");
            if(vertexset.get(parts[0]) != vertexset.get(parts[1])) {
                newedges.put(s,edges.get(s));
                newmin = Math.min(vertexset.get(parts[0]), vertexset.get(parts[1]));
                if(vertexset.get(parts[0]) != newmin) {
                    oldmin = vertexset.get(parts[0]);
                } else {
                    oldmin = vertexset.get(parts[1]);
                }
                for(String y : vertexset.keySet()) {
                    if(vertexset.get(y) == oldmin) {
                        vertexset.put(y,newmin);
                    }
                }
            }
        }
        System.out.println("---Kruskal Algorithm---");
        printMap(newedges);
    }
    
    static void buildMSTPrim(HashMap<String,WeightedNode> graph,ArrayList<WeightedNode> vnew, HashMap<WeightedNode,ArrayList<WeightedNode>> enew) {
        if(graph != null && vnew != null) {
            while(vnew.size() != graph.keySet().size()) {
                float minValue = Float.MAX_VALUE;
                String minkey = "";
                WeightedNode node = new WeightedNode("");
                for(String s : graph.keySet()) {
                    if(vnew.contains(graph.get(s))) {
                        for(WeightedNode v : graph.get(s).adjacencyList.keySet()) {
                            if(!vnew.contains(v) && minValue > graph.get(s).adjacencyList.get(v)) {
                                minValue = graph.get(s).adjacencyList.get(v);
                                node = v;
                                minkey = s;
                            }
                        }
                    }
                }
                vnew.add(node);
                enew.get(graph.get(minkey)).add(node);
                enew.put(node, new ArrayList<WeightedNode>());
            }
            System.out.println("---Prim's Algorithm---");
            for(WeightedNode n : enew.keySet()) {
                for(WeightedNode d: enew.get(n)) {
                    System.out.println(n.label + " -> " + d.label);
                }
            }
        }
    }
    
    public static void main(String[] args){
        HashMap<String,WeightedNode> graph = new HashMap<String,WeightedNode>();
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
        
        node2.adjacencyList.put(node1, 3.0f);
        node2.adjacencyList.put(node4, 2.0f);
        node2.adjacencyList.put(node6, 13.0f);
        
        node3.adjacencyList.put(node1, 2.0f);
        node3.adjacencyList.put(node4, 2.0f);
        node3.adjacencyList.put(node5, 5.0f);
        
        node4.adjacencyList.put(node1, 5.0f);
        node4.adjacencyList.put(node2, 2.0f);
        node4.adjacencyList.put(node3, 2.0f);
        node4.adjacencyList.put(node5, 4.0f);
        node4.adjacencyList.put(node6, 6.0f);
        node4.adjacencyList.put(node7, 3.0f);
        
        node5.adjacencyList.put(node3, 5.0f);
        node5.adjacencyList.put(node4, 4.0f);
        node5.adjacencyList.put(node7, 6.0f);
        
        node6.adjacencyList.put(node2, 13.0f);
        node6.adjacencyList.put(node4, 6.0f);
        node6.adjacencyList.put(node7, 2.0f);
        node6.adjacencyList.put(node8, 3.0f);
        
        node7.adjacencyList.put(node4, 3.0f);
        node7.adjacencyList.put(node5, 6.0f);
        node7.adjacencyList.put(node6, 2.0f);
        node7.adjacencyList.put(node8, 6.0f);
        
        node8.adjacencyList.put(node6, 3.0f);
        node8.adjacencyList.put(node7, 6.0f);
        
        graph.put("1", node1);
        graph.put("2", node2);
        graph.put("3", node3);
        graph.put("4", node4);
        graph.put("5", node5);
        graph.put("6", node6);
        graph.put("7", node7);
        graph.put("8", node8);
        
        ArrayList<WeightedNode> vnew = new ArrayList<WeightedNode>();
        vnew.add(node1);
        HashMap<WeightedNode,ArrayList<WeightedNode>> enew = new LinkedHashMap<WeightedNode, ArrayList<WeightedNode>>();
        enew.put(node1, new ArrayList<WeightedNode>());
        buildMSTPrim(graph,vnew,enew);
        
        HashMap<String,Float> edges = new HashMap<String,Float>();
        for(String s: graph.keySet()) {
            for(WeightedNode w : graph.get(s).adjacencyList.keySet()) {
                edges.put(s+ " " +w.label, graph.get(s).adjacencyList.get(w));
            }
        }
        HashMap<String,Float> nedges = (HashMap<String,Float>) sortByComparator(edges);
        buildMSTKruskal(nedges,graph);
    }
}
