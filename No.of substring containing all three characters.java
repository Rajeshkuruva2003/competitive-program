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
//////////////////////
	import java.util.*;
class Main {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int temp[] = {-1, -1, -1, -1, -1};  // last seen positions of a, b, c, d, e
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'e') {
                temp[ch - 'a'] = i;
            }

            // check if all a to e have been seen
            if (temp[0] != -1 && temp[1] != -1 && temp[2] != -1 && temp[3] != -1 && temp[4] != -1) {
                int minIndex = Math.min(temp[0], Math.min(temp[1], Math.min(temp[2], Math.min(temp[3], temp[4]))));
                cnt += 1 + minIndex;
            }
        }

        return cnt;
    }

    public static void main(String args[]) {
        String s = "acbadbec";
        int res = numberOfSubstrings(s);
        System.out.println(res);  // Output should be 6
    }
}
