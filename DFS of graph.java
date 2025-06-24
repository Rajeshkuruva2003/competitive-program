import java.util.*;

public class Main {

    public static void dfsgraph(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> dfsList) {
        visited[node] = true;
        dfsList.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsgraph(neighbor, visited, adj, dfsList);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt(); // number of vertices
        int e = sc.nextInt(); // number of edges

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Input edges
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int t = sc.nextInt();
            adj.get(u).add(t);
            adj.get(t).add(u); // for undirected graph
        }

        boolean[] visited = new boolean[v];
        List<Integer> dfsResult = new ArrayList<>();

        dfsgraph(0, visited, adj, dfsResult); // start DFS from node 0

        System.out.println("DFS Traversal: " + dfsResult);
    }
}
