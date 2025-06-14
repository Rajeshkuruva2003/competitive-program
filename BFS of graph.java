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
}
tc:O(V+E)