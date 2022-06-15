package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PerfectFriends {
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

    public static void drawTreeGenerateComponent(ArrayList<ArrayList<Edge>> graph, int src, boolean[] visited, ArrayList<Integer> comp){
        visited[src] = true;
        comp.add(src);
        for(Edge edge: graph.get(src)){
            if(!visited[edge.nbr]){
                drawTreeGenerateComponent(graph, edge.nbr, visited,comp);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vtces = 7;
        int edges = 5;
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
        boolean[] visited = new boolean[vtces];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for(int i =0; i< vtces; i++){
            if(!visited[i]){
                ArrayList<Integer> comp = new ArrayList<>();
                drawTreeGenerateComponent(graph, i, visited, comp);
                comps.add(comp);
            }
        }
        int pairs = 0;
        for(int i =0; i<comps.size(); i++){
            for (int j=i+1; j<comps.size(); j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pairs+=count;
            }
        }
        System.out.println(pairs);
    }
}
