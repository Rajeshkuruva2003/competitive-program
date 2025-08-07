import java.util.*;

public class Main {

    public static int fun(int ind, int n[]) {
        if (ind == 0) return 0; // Base case: cost to reach first index is 0

        int left = fun(ind - 1, n) + Math.abs(n[ind] - n[ind - 1]);
        
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = fun(ind - 2, n) + Math.abs(n[ind] - n[ind - 2]);
        }

        return Math.min(left, right);
    }

    public static void main(String[] args) {
        int n[] = {20, 40, 10, 0, 40, 70};
        int m = n.length;

        System.out.println(fun(m - 1, n));  // Print the min cost to reach last index
    }
}
TC:O(2^n)
sc:O(n)
                                        using DP(Top down)
    import java.util.*;

public class Main {

    public static int fun(int ind, int n[],int dp[]) {
        if (ind == 0) return 0; 
        if(dp[ind]!=-1) return dp[ind];
        int left = fun(ind - 1, n,dp) + Math.abs(n[ind] - n[ind - 1]);
        
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = fun(ind - 2, n,dp) + Math.abs(n[ind] - n[ind - 2]);
        }

        return dp[ind]=Math.min(left, right);
    }

    public static void main(String[] args) {
        int n[] = {20, 40, 10, 0, 40, 70};
        int m = n.length;
        int dp[]=new int[m+1];
        Arrays.fill(dp,-1);
        

        System.out.println(fun(m - 1, n,dp));  
    }
}
tc:O(n)
sc:O(n)                                    
                                    using DP(Bottom up)
           import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n[] = {20, 40, 10, 0, 40, 70};
        int m = n.length;
        int dp[]=new int[m+1];
        dp[0]=0;
        for(int ind=1;ind<m;ind++){
            int left = dp[ind - 1] + Math.abs(n[ind] - n[ind - 1]);
            
            int right = Integer.MAX_VALUE;
            if (ind > 1) {
                right = dp[ind - 2]+ Math.abs(n[ind] - n[ind - 2]);
            }
    
               dp[ind]=Math.min(left, right);
        }

   
        

        System.out.println(dp[m-1]);  
    }
}
TC:O(n)
sc:O(n)                    
                           using Two variables
                           
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n[] = {20, 40, 10, 0, 40, 70};
        int m = n.length;
        int pre=0;
        int pre1=0;
        for(int i=1;i<m;i++)
            int l=pre+Math.abs(n[i]-n[i-1]);
            int r=Integer.MAX_VALUE;
            if(i>1){
                r=pre1+Math.abs(n[i]-n[i-2]);
            }
            int cur=Math.min(l,r);
            pre1=pre;
            pre=cur;
        }
        System.out.println(pre);
    }
}
TC:O(n)
sc:O(1)