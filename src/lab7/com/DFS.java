package lab7.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFS {
    private final Set<Integer> visited = new HashSet<>();
    private final List<Integer> result = new ArrayList<>();

    public List<Integer> performDFS(Graph graph, int start) {
        dfsHelper(graph, start);
        return result;
    }

    private void dfsHelper(Graph graph, int vertex) {
        if (visited.contains(vertex)) return;
        visited.add(vertex);
        result.add(vertex);
        for (int neighbor : graph.getNeighbors(vertex)) {
            dfsHelper(graph, neighbor);
        }
    }
}
