package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BFSTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int V = scn.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<V; i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            adj.get(u).add(v);
        }
    }
}
