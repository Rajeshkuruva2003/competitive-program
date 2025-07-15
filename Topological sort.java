

class Solution {
    public void dfs(int[] vis, int i, Stack<Integer> st, List<List<Integer>> adj) {
        vis[i] = 1;
        for (int it : adj.get(i)) {
            if (vis[it] == 0) {
                dfs(vis, it, st, adj);
            }
        }
        st.push(i);
    }

    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        Stack<Integer> st = new Stack<>();
        int[] vis = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(vis, i, st, adj);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        return ans;
    }
}
