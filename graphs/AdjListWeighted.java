package graphs;
import java.util.*;
public class AdjListWeighted {

    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(0, 2,-1));
        
        
    }



    public static void main(String[] args) {
        int V=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
     
            for (int i = 0; i < graph[2].size(); i++) {
                Edge e=graph[2].get(i);
                System.out.println(" "+("Neghibour-> "+e.dest+" Weight-> "+e.wt));
            }
        

     
    }
}

