package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsCyclic {
    
    private static boolean isCyclicGraph(ArrayList<ArrayList<Integer>> graph, int src, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while (!queue.isEmpty()){
            int node = queue.poll();
            if(visited[node]){
                return true;
            }
            visited[node]= true;
            for(Integer value: graph.get(node)){
                if(!visited[value]){
                    queue.add(value);
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        int vtces = 7;
        int edges = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i =0; i<edges; i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);

        }
        boolean[] visited = new boolean[vtces];
        boolean isCylic = false;
        for (int v = 0; v < vtces; v++) {
            if(!visited[v]){
                isCylic = isCyclicGraph(graph, v, visited);
            }
        }
        System.out.println(isCylic);
    }
    
}
