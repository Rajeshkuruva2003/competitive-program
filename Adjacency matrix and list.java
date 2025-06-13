import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] adj = new int[n + 1][n + 1]; 

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
tc:O(n^2)
////////////////////////
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        
        ArrayList<Integer>[] adj = new ArrayList[n + 1 ]; // 1-based indexing
        
        // Initialize each ArrayList
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        // Read edges
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            
            // Add both directions for undirected graph
            adj[u].add(v);
            adj[v].add(u);
        }

        // Optional: Print the adjacency list
        System.out.println("Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
tc:O(n+m)
