package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintAllPath {
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void printAllPaths(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited, String psf){
        if(src==dest){
            System.out.println(psf);
            return;
        }
        visited[src]= true;
        for(Edge edge:graph.get(src)){
            if(!visited[edge.nbr]){
                printAllPaths(graph, edge.nbr, dest, visited, psf+edge.nbr);
            }
        }
        visited[src]=false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vtces = 7;
        int edges = 8;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph.get(v1).add(new Edge(v1, v2, wt));
            graph.get(v2).add(new Edge(v2, v1, wt));
        }
        int src = 0;
        int dest = 6;
        boolean[] visited = new boolean[vtces+1];
        printAllPaths(graph, src, dest, visited, src+"");
    }
}
