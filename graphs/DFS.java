package graphs;
import java.util.*;
public class DFS {

  static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }



    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vist[])
    {
       System.out.print(curr+" ");
       vist[curr]=true;

       for (int i = 0; i < graph[curr].size(); i++) {
        Edge e=graph[curr].get(i);
        if(vist[e.dest]==false){
        dfs(graph,e.dest,vist);
        }
       }
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean vist[]=new boolean[V];
        for (int i = 0; i < V; i++) {
            if(vist[i]==false)
            dfs(graph, i, vist);
        }
        System.out.println(" ");
}
    
}
