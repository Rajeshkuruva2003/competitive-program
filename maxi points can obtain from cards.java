class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0;
        int rsum=0;
        int sum=0;
        int temp=0;
        for(int r=0;r<k;r++){
            lsum+=cardPoints[r];
        }
         sum=lsum;
         int right=n-1;
         for(int r=k-1;r>=0;r--){
            lsum-=cardPoints[r];
            rsum+=cardPoints[right];
            right--;
            sum=Math.max(sum,lsum+rsum);
        }

          
          return sum;
    }
}