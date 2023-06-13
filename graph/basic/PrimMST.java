package graph.basic;

import java.util.*;

public class PrimMST {
    private static final int INF = Integer.MAX_VALUE;

    public static List<Edge> primMST(int[][] graph) {
        int vertices = graph.length;
        int[] key = new int[vertices];
        int[] parent = new int[vertices];
        boolean[] mstSet = new boolean[vertices];

        List<Edge> mst = new ArrayList<>();

        Arrays.fill(key, INF);
        Arrays.fill(mstSet, false);

        key[0] = 0; // Start with the first vertex
        parent[0] = -1;

        for (int count = 0; count < vertices - 1; count++) {
            int u = findMinimumKeyVertex(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        for (int i = 1; i < vertices; i++) {
            mst.add(new Edge(parent[i], i, graph[i][parent[i]]));
        }

        return mst;
    }

    private static int findMinimumKeyVertex(int[] key, boolean[] mstSet) {
        int minKey = INF;
        int minIndex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!mstSet[v] && key[v] < minKey) {
                minKey = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };

        List<Edge> mst = primMST(graph);

        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : mst) {
            System.out.println(edge);
        }
    }
}

class Edge {
    int source;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + source + " - " + destination + ", " + weight + ")";
    }
}
