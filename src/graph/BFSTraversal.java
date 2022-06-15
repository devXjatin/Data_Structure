package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversal {

    private static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int src, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        visited[src] = true;
        queue.add(src);
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node+" ");
            for(Integer value: graph.get(node)){
                if(!visited[value]){
                    visited[value]=true;
                    queue.add(value);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        int vtces = 7;
        int edges = 8;
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
        bfsTraversal(graph, 0, visited);
    }

}
