package app;

import java.util.*;


public class Graph {
    Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new HashSet<>());
    }

    public void addEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.containsKey(destination)) {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);
        }
    }

    public void removeVertex(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            for (Set<Integer> neighbors : adjacencyList.values()) {
                neighbors.remove(vertex);
            }

            adjacencyList.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.containsKey(destination)) {
            adjacencyList.get(source).remove(destination);
            adjacencyList.get(destination).remove(source);
        }
    }

    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
    }
}
