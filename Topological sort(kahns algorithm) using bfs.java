

class Solution {
   

    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        int vis[]=new int[V];
        for(int i=0;i<V;i++){
             for(int it : adj.get(i)){
                 vis[it]++;
             }
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int k=q.poll();
            
            topo.add(k);
            for(int it:adj.get(k)){
                vis[it]--;
                if(vis[it]==0){
                    q.add(it);
                }
            }
            
            
        }
        return topo;
        
    }
}
