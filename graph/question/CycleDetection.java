package graph.question;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
    private int vertices;
    private List<List<Integer>> adjList;

    public CycleDetection(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCyclicUtil(int vertex, boolean[] visited, int parent) {
        visited[vertex] = true;

        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                if (isCyclicUtil(neighbor, visited, vertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int vertices = 5;
        CycleDetection graph = new CycleDetection(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        if (graph.isCyclic()) {
            System.out.println("Cycle is present in the graph");
        } else {
            System.out.println("Cycle is not present in the graph");
        }
    }
}
