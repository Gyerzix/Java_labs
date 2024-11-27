package lab13.com;

import java.util.*;

public class KruskalMST {
    private int vertices;
    public List<Edge> edges;

    public KruskalMST(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }
    // Добавить ребро в граф
    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }
    // Алгоритм Краскала
    public List<Edge> findMST() {
        Collections.sort(edges);
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }
        List<Edge> mst = new ArrayList<>();
        for (Edge edge : edges) {
            // Найти корни вершин ребра
            int rootSource = find(parent, edge.source);
            int rootDestination = find(parent, edge.destination);

            // Если добавление ребра не создаёт цикл
            if (rootSource != rootDestination) {
                mst.add(edge);
                union(parent, rootSource, rootDestination);
            }
        }
        return mst;
    }
    private int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]); // Компрессия пути
        }
        return parent[vertex];
    }
    private void union(int[] parent, int root1, int root2) {
        parent[root2] = root1;
    }
}
