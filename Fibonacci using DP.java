                                    BOTTOM-UP DP
public class FibonacciDP {
    public static int fibonacci(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1]; // dp[i] will store the ith Fibonacci number
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
TC:O(n)
SC:O(n)
                               (OR)
import java.util.*;
class Main{
    public static void main(String[] args){
        int n=5;
        int pre=0;
        int pre1=1;
        int cur=0;
        for(int i=2;i<=n;i++){
            cur=pre+pre1;
            pre=pre1;
            pre1=cur;
        }
        System.out.println(cur);
    }
}    
TC:O(n)
Sc:O(1)                           
                                        TOP-DOWN DP
import java.util.*;
class Main {
    static int dp[];
    public  static int fun(int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fun(n-1)+fun(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fun(n));
        
    }

}
TC:O(n)
SC:O(n)+O(n)=O(n)