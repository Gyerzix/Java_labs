package lab7.com;

import java.util.*;

public class Graph {
    private final Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Для неориентированного графа
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<Integer> getVertices() {
        return adjacencyList.keySet();
    }

    public void printGraph() {
        System.out.println("Graph representation:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

