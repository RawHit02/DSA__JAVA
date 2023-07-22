package Graph;

import java.util.ArrayList;

public class GraphDemo {

    // this function connects 2 nodes
    // 2D array list is used in addEdge()
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 4;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        printGraph(adj);

    }
}
