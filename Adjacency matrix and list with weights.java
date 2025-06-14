import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int adj[][]=new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            adj[u][v]=w;
            adj[v][u]=w;
        }
        System.out.println("Adjacency matrix:" );
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
tc:O(n^2+m)
sc:O(n^2)
/////////////....
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        
        ArrayList<int[]>[] adj = new ArrayList[n + 1 ]; 
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w=scanner.nextInt();
            
            adj[u].add(new int[]{v,w});
            adj[v].add(new int[]{u,w});
        }

        System.out.println("Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int[] pair : adj[i]) {
                System.out.print("(" + pair[0] + "," + pair[1] + ") ");
            }
            System.out.println();
        }

    }
}
tc:O(n+m)
sc:O(n+m)