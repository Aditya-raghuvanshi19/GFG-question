// User function Template for Java

class Solution {
    static long[]dp;
    static final int mod=1000000007;
    
    static long fib(int n){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        
        dp[n]= (fib(n-1)+fib(n-2))%mod;
        return dp[n];
    }
    static long topDown(int n) {
        
        dp=new long[n+1];
        Arrays.fill(dp,-1);
        return fib(n) % mod;
        
    }

    static long bottomUp(int n) {
        
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]= (dp[i-1]+dp[i-2]) % mod;
        }
        return dp[n]%mod;
    }
}
