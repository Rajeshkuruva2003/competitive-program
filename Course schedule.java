class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            adj.get(edge[0]).add(edge[1]);
        }
        int vis[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
             for(int it : adj.get(i)){
                 vis[it]++;
             }
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
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
        if(topo.size()==numCourses){
            return true;
        }
        return false;
        
    }

}