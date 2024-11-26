package lab12.com;

public class FloydWarshall {
    public static void floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];
        int[][] next = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 0 && i != j) {
                    dist[i][j] = Integer.MAX_VALUE; // "Бесконечность" для недостижимых вершин
                    next[i][j] = -1; // Нет пути
                } else {
                    dist[i][j] = graph[i][j];
                    next[i][j] = j; // Предшественник — сама конечная вершина
                }
            }
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE
                            && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
        printSolution(dist, next);
    }
    private static void printSolution(int[][] dist, int[][] next) {
        int V = dist.length;
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\nPaths:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j && next[i][j] != -1) {
                    System.out.print("Path from " + i + " to " + j + ": ");
                    printPath(i, j, next);
                    System.out.println();
                }
            }
        }
    }
    private static void printPath(int i, int j, int[][] next) {
        if (i != j) {
            System.out.print(i + " ");
        }
        while (i != j) {
            i = next[i][j];
            System.out.print(i + " ");
        }
    }
}

