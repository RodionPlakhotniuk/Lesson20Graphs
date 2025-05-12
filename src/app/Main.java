package app;


import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();


        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        System.out.println("Вершини в графі: " + graph.adjacencyList.keySet());

        System.out.println();

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(1, 4);

        System.out.println("Ребра в графі:");
        for (Map.Entry<Integer, Set<Integer>> entry : graph.adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();

        System.out.println("Перевірка наявності вершин та ребер:");
        System.out.println("Чи існує вершина 2? " + graph.hasVertex(2));
        System.out.println("Чи існує ребро між 1 та 2? " + graph.hasEdge(1, 2));
        System.out.println("Чи існує ребро між 1 та 3? " + graph.hasEdge(1, 3));

        System.out.println();

        System.out.println("Видалення ребра:");
        graph.removeEdge(1, 2);
        System.out.println("Ребро між 1 та 2 видалено. Чи існує воно тепер?: " + graph.hasEdge(1, 2));


        System.out.println("Ребра в графі після видалення ребра (1, 2):");
        for (Map.Entry<Integer, Set<Integer>> entry : graph.adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();

        System.out.println("Видалення вершини:");
        graph.removeVertex(3);
        System.out.println("Вершина 3 видалена. Чи існує вона тепер?: " + graph.hasVertex(3));

        System.out.println();


        System.out.println("Вершини в графі після видалення вершини 3: " + graph.adjacencyList.keySet());
        System.out.println("Ребра в графі після видалення вершини 3:");
        for (Map.Entry<Integer, Set<Integer>> entry : graph.adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
