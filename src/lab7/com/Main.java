package lab7.com;

public class Main {
    public static void main(String[] args) {
        // Создаем граф
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);

        // Вывод графа
        graph.printGraph();

        // Тестирование DFS
        DFS dfs = new DFS();
        System.out.println("DFS Traversal: " + dfs.performDFS(graph, 1));

        // Тестирование BFS
        BFS bfs = new BFS();
        System.out.println("BFS Traversal: " + bfs.performBFS(graph, 1));
    }
}
