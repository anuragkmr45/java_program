package graph.Travers;

import java.util.*;

public class DFS {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public DFS(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
        while (iterator.hasNext()) {
            int neighbor = iterator.next();
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("DFS traversal starting from vertex 0:");
        graph.DFS(0);
    }
}
