class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            ls.add(new ArrayList<>());
        } 
        int indeg[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int it:graph[i]){
                ls.get(it).add(i);
                indeg[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> safe=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int s=q.peek();
            q.remove();
            safe.add(s);
            for(int i:ls.get(s)){
                indeg[i]--;
                if(indeg[i]==0){
                    q.add(i);
                }
            }
        }
        Collections.sort(safe);
        return safe;

    }
}