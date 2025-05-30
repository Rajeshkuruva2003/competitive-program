class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1]; // Parent array

        // Initialize parent array: each node is its own parent
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        int[] ans = {0, 0}; // Store the redundant edge

        for (int[] edge : edges) {
            int p1 = find(parent, edge[0]); // Find root of first node
            int p2 = find(parent, edge[1]); // Find root of second node

            if (p1 == p2) {
                ans = edge; // If they have the same root, this edge is redundant
            } else {
                parent[p2] = p1; // Union: connect p2 to p1
            }
        }
        return ans;
    }

    // Union-Find with Path Compression
    private int find(int[] parent, int node) {
        while (parent[node] != node) {
            parent[node] = parent[parent[node]]; // Path compression
            node = parent[node];
        }
        return node;
    }
}