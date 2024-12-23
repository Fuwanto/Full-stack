// 1. Implementa un grafo con una matriz de adyacencia y realiza el recorrido BFS y DFS.
// 2. Escribe un programa que calcule el grado de entrada y salida de cada nodo en un grafo dirigido.

import java.util.LinkedList;

public class Grafo {
    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    Grafo(int v) {
        V = v;
        adj = (LinkedList<Integer>[]) new LinkedList<?>[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int s) {
        boolean visited[] = new boolean[V];
        DFSUtil(s, visited);
    }

    void DFSUtil(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int n : adj[s]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void gradoNodos() {
        int gradoEntrada[] = new int[V];
        int gradoSalida[] = new int[V];
        for (int i = 0; i < V; i++) {
            gradoSalida[i] = adj[i].size();
            for (int n : adj[i]) {
                gradoEntrada[n]++;
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println(
                    "Nodo " + i + ": Grado de entrada: " + gradoEntrada[i] + ", Grado de salida: " + gradoSalida[i]);
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("BFS:");
        g.BFS(2);
        System.out.println("\nDFS:");
        g.DFS(2);

        System.out.println("\nGrado de nodos:");
        g.gradoNodos();

    }
}
