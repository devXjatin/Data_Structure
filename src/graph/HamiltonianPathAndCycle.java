package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class HamiltonianPathAndCycle {

    private static void hamiltonianPathAndCycle(ArrayList<ArrayList<Integer>> graph, int src, HashSet<Integer> visited, String psf, int osrc){
        if(visited.size()== graph.size()-1){
            System.out.print(psf);
            boolean isCycle = false;
            for(Integer nbr: graph.get(src)){
                if(nbr == osrc){
                    isCycle = true;
                    break;
                }
            }
            if(isCycle){
                System.out.println("*");
            }else{
                System.out.println(".");
            }

        }
        visited.add(src);
        for(Integer nbr: graph.get(src)){
            if(!visited.contains(nbr)){
                hamiltonianPathAndCycle(graph, nbr, visited, psf+nbr, osrc);
            }
        }
        visited.remove(src);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int vtces = 7;
        int edges = 9;
        for (int i = 0; i <vtces ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        int src = 0;
        HashSet<Integer> visited = new HashSet<>();
        hamiltonianPathAndCycle(graph, src, visited, src+"", src);
    }
}
