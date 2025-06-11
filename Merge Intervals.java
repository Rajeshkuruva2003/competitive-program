class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> ls=new ArrayList<>();
       int n=intervals.length;
       
        if(intervals.length==0 || intervals==null){
             return ls.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ls.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
           
            
        }
         ls.add(new int[]{start,end});
        
       return ls.toArray(new int[ls.size()][]);
    }
}
tc:O(nlogn)+O(n)=O(nlogn)
sc:O(n)