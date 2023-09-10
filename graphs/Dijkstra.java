package graphs;

import java.util.*;

public class Dijkstra {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class Pair implements Comparable<Pair> {
        int nodes;
        int dist;

        public Pair(int n, int d) {
            this.nodes = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }

    }

    public static void dijkstraalgo(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        //////////// DIJKSATRA ALGO///////////////////
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.nodes]) {
                vis[curr.nodes] = true;

                for (int i = 0; i < graph[curr.nodes].size(); i++) {
                    Edge e = graph[curr.nodes].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        int V = 6 ;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);

        dijkstraalgo(graph, 0, V);

    }

}
