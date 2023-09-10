package graphs;

import java.util.*;

public class TopoSort {

    public class create {
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
            graph[0].add(new Edge(2, 3));
            graph[1].add(new Edge(3, 1));
            graph[1].add(new Edge(4, 0));
            graph[1].add(new Edge(4, 1));
            graph[1].add(new Edge(5, 0));
            graph[1].add(new Edge(5, 2));

        }

        public static void TopologicalSortutil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack) {
            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    TopologicalSortutil(graph, e.dest, vis, stack);

                }
            }
            stack.push(curr);

        }

        public static void TopologicalSort(ArrayList<Edge> graph[], int V) {
            boolean vis[] = new boolean[V];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < V; i++) {
                if (!vis[i]) {
                    TopologicalSortutil(graph, i, vis, stack);
                }
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop() + " ");
            }

        }

        /**
         * @param args
         */
        public static void main(String[] args) 
        {
            int V = 6;
            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[V];
            creatGraph(graph);
            TopologicalSort(graph, V);

        }
    }
}
