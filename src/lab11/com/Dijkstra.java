package lab11.com;

import java.util.*;

public class Dijkstra {
    public static void dijkstra(int[][] graph, int startVertex) {
        int n = graph.length; // Количество вершин
        int[] distances = new int[n]; // Массив для хранения кратчайших расстояний
        boolean[] visited = new boolean[n]; // Массив для отслеживания посещённых вершин
        int[] predecessors = new int[n]; // Массив для восстановления путей
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(predecessors, -1);
        distances[startVertex] = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = findMinDistance(distances, visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && distances[u] != Integer.MAX_VALUE &&
                        distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                    predecessors[v] = u;
                }
            }
        }
        printResults(distances, predecessors, startVertex);
    }
    private static int findMinDistance(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    private static void printResults(int[] distances, int[] predecessors, int startVertex) {
        System.out.println("Vertex\tDistance\tPath");
        for (int i = 0; i < distances.length; i++) {
            System.out.print(i + "\t" + distances[i] + "\t\t");
            printPath(i, predecessors);
            System.out.println();
        }
    }
    private static void printPath(int vertex, int[] predecessors) {
        if (vertex == -1) return;
        printPath(predecessors[vertex], predecessors);
        System.out.print(vertex + " ");
    }
}

