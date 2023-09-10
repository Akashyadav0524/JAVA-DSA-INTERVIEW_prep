package graphs;
import java.util.*;
public class KosaRaju {
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));


        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void topSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
         for (int i = 0; i < graph[curr].size(); i++) {
            Edge e =graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
         }
         s.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vist[])
    {
       
       vist[curr]=true;
        System.out.print(curr+" ");
       for (int i = 0; i < graph[curr].size(); i++) {
        Edge e=graph[curr].get(i);
        if(vist[e.dest]==false){
        dfs(graph,e.dest,vist);
        }
       }
    }


    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        // Step1
        Stack<Integer> s = new Stack<>();
        boolean vis[]= new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }

        //Step2
        @SuppressWarnings("unchecked")
        ArrayList<Edge> Transposegraph[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i] =false;
            Transposegraph[i] = new ArrayList<Edge>();
        }
        //find all the edges on the on the orignal graph  e.src-->e.dest tak
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
              Edge e= graph[i].get(j); 
        //ab wulta transpose karna hai e.dest-->e.src tak har ek elemet ko add kara denge
            Transposegraph[e.dest].add(new Edge(e.dest, e.src));

            }
            
        }

        //Step 3
        // Stack me se  ek ek kar k node niklao aur wuspe dfs performe kardo
        while(!s.isEmpty()){
            int curr =s.pop();
            if(!vis[curr]){
                dfs(Transposegraph, curr, vis);//agr unvisted hai to dfs k through call karlenge;
                System.out.println();

            }

        }

    }

    public static void main(String[] args) {
        int V = 5 ;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);

        kosaraju(graph, V);

       

    }

}
