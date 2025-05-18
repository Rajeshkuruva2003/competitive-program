class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int temp[]={-1,-1,-1};
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            temp[ch-'a']=i;
            if(temp[0]!=-1 && temp[1]!=-1 && temp[2]!=-1){
                cnt=cnt+1+Math.min(temp[0],Math.min(temp[1],temp[2]));
            }

        }
        return cnt;
    }
}