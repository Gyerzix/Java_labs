package lab11.com;

public class Main {
    public static void main(String[] args) {
        // Матрица смежности графа (0 - отсутствие ребра)
        int[][] graph = {
                {0, 10, 0, 0, 0, 0},
                {10, 0, 5, 0, 0, 15},
                {0, 5, 0, 20, 0, 0},
                {0, 0, 20, 0, 10, 0},
                {0, 0, 0, 10, 0, 5},
                {0, 15, 0, 0, 5, 0}
        };

        // Вывод представления графа
        printGraphRepresentation(graph);

        // Запуск алгоритма Дейкстры с начальной вершиной 0
        System.out.println("\nDijkstra's Algorithm Results:");
        Dijkstra.dijkstra(graph, 0);
    }
    // Представления графа в виде списка рёбер
    private static void printGraphRepresentation(int[][] graph) {
        System.out.println("Graph Representation:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    System.out.println(i + " -> " + j + " (" + graph[i][j] + ")");
                }
            }
        }
    }
}
