class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ls=new ArrayList<>();
        Queue<Integer> qu=new LinkedList<>();
        int V=adj.size();
        boolean vis[]=new boolean[V];
        qu.add(0);
        vis[0]=true;
        while(!qu.isEmpty()){
            int node=qu.poll();
            ls.add(node);
            for(int it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    qu.add(it);
                }
            }
        }
        return ls;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of vertices and edges
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Take edges input
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // remove this line for a directed graph
        }

        // Call BFS
        List<Integer> bfsResult = bfsOfGraph(V, adj);

        System.out.println("BFS Traversal: " + bfsResult);
    }


}

tc:O(N)+O(2E)
sc:O(N)
