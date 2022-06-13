package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSTraversal {

    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> stordfs){
        stordfs.add(i);
        visited[i] = true;
        for(Integer it: adj.get(i)){
            if(!visited[it]){
                dfs(it, adj, visited, stordfs);
            }
        }
    }

    static ArrayList<Integer> dfsTraversal(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> storeDfs = new ArrayList<>();
        boolean[] visited = new boolean[V+1];
        for (int i = 1; i <=V ; i++) {
            if(!visited[i]){
                dfs(i,adj, visited, storeDfs);
            }
        }
        return storeDfs;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int V = scn.nextInt();
        int E = scn.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<E; i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<Integer> dfs = dfsTraversal(adj, V);
        System.out.println(dfs);
        System.out.println(adj);
        for(int it: adj.get(1)){
            System.out.println(it);
        }
    }
}

