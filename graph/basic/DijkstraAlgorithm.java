package graph.basic;

import java.util.*;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static int[] dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distances, INF);
        Arrays.fill(visited, false);

        distances[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = findMinimumDistanceVertex(distances, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && distances[u] != INF
                        && distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                }
            }
        }

        return distances;
    }

    private static int findMinimumDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = INF;
        int minIndex = -1;

        for (int v = 0; v < distances.length; v++) {
            if (!visited[v] && distances[v] < minDistance) {
                minDistance = distances[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };

        int source = 0;
        int[] shortestDistances = dijkstra(graph, source);

        System.out.println("Shortest Distances from Source Vertex " + source + ":");
        for (int i = 0; i < shortestDistances.length; i++) {
            System.out.println("Vertex " + i + ": " + shortestDistances[i]);
        }
    }
}
