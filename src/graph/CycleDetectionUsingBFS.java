package graph;

import java.util.*;

class Node{
    int first;
    int second;
    public Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}

public class CycleDetectionUsingBFS {

    private static boolean isCycleDetect(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        visited[s] = true;
        while (!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer it: adj.get(node)){
                if(!visited[it]){
                    q.add(new Node(it, node));
                    visited[it] = true;
                }else if(par != it){
                    return true;
                }
            }

        }
return false;
    }
    static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V+1];
        Arrays.fill(visited, false);
        for (int i = 1; i <=V ; i++) {
            if(!visited[i]){
                if(isCycleDetect(adj,i, visited)){
                    return true;
                }
            }
            
        }
        return false;
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
        boolean isCycle = isCycle(adj, V);
        System.out.println(isCycle);
    }
}
