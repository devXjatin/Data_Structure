package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversal {

    static ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adj, int n){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);
                    for(Integer it: adj.get(node)){
                        if(!visited[it]){
                            visited[it] = true;
                            q.add(it);
                        }
                    }
                }
            }

        }
        return bfs;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int V = scn.nextInt();
        int E = scn.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <=V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<E; i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        ArrayList<Integer> bfs = bfsTraversal(adj, V);
        System.out.println(bfs);
        System.out.println(adj);
        for(int it: adj.get(1)){
            System.out.println(it);
        }
//        System.out.println(adj.get(1));
    }
}

