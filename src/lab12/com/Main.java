package lab12.com;

public class Main {
    public static void main(String[] args) {
        // Матрица смежности графа (0 означает отсутствие ребра)
        int[][] graph = {
                {0, 3, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 7, 0, 2},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 3},
                {0, 0, 0, 0, 0, 0}
        };

        // Вывод исходного графа
        printGraphRepresentation(graph);

        // Тестирование алгоритма Флойда-Уоршелла
        System.out.println("\nRunning Floyd-Warshall Algorithm...");
        FloydWarshall.floydWarshall(graph);
    }

    // Метод для представления графа в виде списка рёбер
    private static void printGraphRepresentation(int[][] graph) {
        System.out.println("Graph Representation:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    System.out.println(i + " -> " + j + " (Weight: " + graph[i][j] + ")");
                }
            }
        }
    }
}
