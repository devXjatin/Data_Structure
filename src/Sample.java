import java.util.ArrayList;

public class Sample {
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr= nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int vtces = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<Edge>());
        }
        graph.get(0).add(new Edge(0, 3, 10));
        graph.get(0).add(new Edge(0, 1, 10));
        for(Edge edge: graph.get(0)){
            System.out.println(edge);
            System.out.println(edge.nbr);

        }
    }
}
