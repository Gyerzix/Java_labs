package lab13.com;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём граф с 6 вершинами
        KruskalMST graph = new KruskalMST(6);

        // Добавляем рёбра
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 0, 4);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 5, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 4, 3);
        graph.addEdge(4, 5, 3);

        // Выводим граф перед началом алгоритма
        System.out.println("Graph Representation:");
        for (Edge edge : graph.edges) {
            System.out.println(edge.source + " -- " + edge.destination + " (Weight: " + edge.weight + ")");
        }

        // Находим минимальное остовное дерево
        List<Edge> mst = graph.findMST();

        // Выводим результат
        System.out.println("\nEdges in the Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " -- " + edge.destination + " (Weight: " + edge.weight + ")");
        }
    }
}
