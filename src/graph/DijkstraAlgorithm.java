package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijkstraAlgorithm {

    static class Edge{
        int src;
        int wt;
        Edge(int src, int wt){
            this.src = src;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair>{

        int vertex;
        int weight;
        Pair( int vertex, int weight){
            this.vertex= vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair o) {
            return this.weight - o.weight;
        }
    }

    //Dijkstra Algorithm
    public static int[] dijkstraAlgorithm(ArrayList<ArrayList<Pair>> graph, int src, boolean[] visited){
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            if(visited[node.vertex]){
                continue;
            }
            visited[node.vertex] = true;
            for(Pair v :graph.get(node.vertex)){
                if(!visited[v.vertex] && dist[node.vertex]+v.weight < dist[v.vertex]){
                    dist[v.vertex]= dist[node.vertex]+ v.weight;
                    pq.add(new Pair(v.vertex, dist[v.vertex]));
                }

            }
        }
        return dist;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        int vtces = 5;
        int edges = 5;
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i =0; i<edges; i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph.get(v1).add(new Pair(v2, wt));
            graph.get(v2).add(new Pair(v1,wt));
        }
        boolean[] visited = new boolean[vtces];
        int src=0;
        int[] dist = dijkstraAlgorithm(graph, src, visited);
        for(int v: dist){
            System.out.print(v+" ");
        }

    }
}
