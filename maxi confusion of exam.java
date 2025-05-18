class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int countt=0;
        int countf=0;
        int ans=0;
        int n=answerKey.length();
        for(int i=0;i<n;i++){
           char ch=answerKey.charAt(i);
           if(ch=='T'){
            countt++;
           }else{
            countf++;
           }
           while(Math.min(countt,countf)>k){
             if(answerKey.charAt(l)=='T'){
                countt--;
            }
            else{
                countf--;
            }
            l++;
           }
           ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}