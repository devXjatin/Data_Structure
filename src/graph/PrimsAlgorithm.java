package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgorithm {
    static class Pair implements Comparable<Pair>{
        int vertex;
        int av; //acquiring vertex which is set to be -1 coz we assume 0 vertex comes from it and this is also used
                //for neighbour vertex.
        int weight;
        Pair( int vertex,int av, int weight){
            this.vertex= vertex;
            this.weight = weight;
            this.av=av;
        }
        @Override
        public int compareTo(Pair o) {
            return this.weight - o.weight;
        }
    }

    static void primsAlgorithm(ArrayList<ArrayList<Pair>> graph, int src, boolean[] visited){
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        pq.add(new Pair(0, -1, 0));
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            if(visited[node.vertex]){
                continue;
            }
            visited[node.vertex]=true;
            if(node.av != -1){
                System.out.println("["+node.av+" - "+ node.vertex+" @"+ node.weight+"]");
            }
            for(Pair v : graph.get(node.vertex)){
                if(!visited[v.av]){
                    pq.add(new Pair(v.av, node.vertex, v.weight));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        int vtces = 7;
        int edges = 8;
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i =0; i<edges; i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph.get(v1).add(new Pair(v1, v2, wt));
            graph.get(v2).add(new Pair(v2, v1, wt));
        }
        boolean[] visited = new boolean[vtces+1];
        int src=0;
         primsAlgorithm(graph, src, visited);


    }
}
