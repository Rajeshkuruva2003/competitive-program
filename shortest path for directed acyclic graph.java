import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Main {

    public static void dfs(int node, ArrayList<ArrayList<Pair>> adj, int[] vis, Stack<Integer> st) {
        vis[node] = 1;
        for (Pair p : adj.get(node)) {
            if (vis[p.first] == 0) {
                dfs(p.first, adj, vis, st);
            }
        }
        st.push(node);
    }

    public static void shortPath(int[][] graph, int n, int m) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = graph[i][0];
            int v = graph[i][1];
            int wt = graph[i][2];
            adj.get(u).add(new Pair(v, wt));
        }

        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, adj, vis, st);
            }
        }

        int[] dist = new int[n];
        Arrays.fill(dist, (int) 1e9);
        dist[0] = 0;  // assuming source is 0

        while (!st.isEmpty()) {
            int node = st.pop();

            if (dist[node] != (int) 1e9) {
                for (Pair p : adj.get(node)) {
                    int v = p.first;
                    int wt = p.second;
                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Print distances
        System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < n; i++) {
            if (dist[i] == (int) 1e9) System.out.print("INF ");
            else System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes and edges
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();

        int[][] graph = new int[m][3];

        System.out.println("Enter edges in format: u v wt");
        for (int i = 0; i < m; i++) {
            graph[i][0] = sc.nextInt(); // u
            graph[i][1] = sc.nextInt(); // v
            graph[i][2] = sc.nextInt(); // wt
        }

        shortPath(graph, n, m);
    }
}
