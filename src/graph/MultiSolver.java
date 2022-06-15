package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MultiSolver {
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
    static String spath;
    static int spathwt = Integer.MAX_VALUE;
    static String lpath;
    static int lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static int cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static int fpathwt = Integer.MIN_VALUE;

    public static void multiSolver(ArrayList<ArrayList<PrintAllPath.Edge>> graph, int src, int dest, boolean[] visited, String psf,int wsf, int k, int criteria){
        if(src==dest){
            if(wsf<spathwt){
                spathwt = wsf;
                spath = psf;
            }
            if(wsf> lpathwt){
                lpathwt= wsf;
                lpath = psf;
            }
            if(wsf> criteria && wsf <cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if(wsf < criteria && wsf > fpathwt){
                fpathwt = wsf;
                fpath = psf;
            }
        }
        visited[src]= true;
        for(PrintAllPath.Edge edge:graph.get(src)){
            if(!visited[edge.nbr]){
                multiSolver(graph, edge.nbr, dest, visited, psf+edge.nbr, edge.wt+wsf, k, criteria);
            }
        }
        visited[src]=false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vtces = 7;
        int edges = 8;
        ArrayList<ArrayList<PrintAllPath.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vtces; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph.get(v1).add(new PrintAllPath.Edge(v1, v2, wt));
            graph.get(v2).add(new PrintAllPath.Edge(v2, v1, wt));
        }
        int src = 0;
        int dest = 6;
        boolean[] visited = new boolean[vtces + 1];
        ArrayList<String> allPaths = new ArrayList<>();
        multiSolver(graph, src, dest, visited, src + "", 0, 3, 40);
        System.out.println("Smallest Path: "+spath+" @"+spathwt);
        System.out.println("Longest Path: "+lpath+" @"+lpathwt);
        System.out.println("Ceil Path: "+cpath+" @"+cpathwt);
        System.out.println("Floor Path: "+fpath+" @"+fpathwt);

    }
}
