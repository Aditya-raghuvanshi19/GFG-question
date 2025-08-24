// User function Template for Java
class Solution {
    int memo(int n,int[] height,int[]dp){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        
        int left=memo(n-1,height,dp) + Math.abs(height[n]-height[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        right=memo(n-2,height,dp) + Math.abs(height[n]-height[n-2]);
        
        int minicost=Math.min(left,right);
        dp[n]=minicost;
        return minicost;
        
    }
    int minCost(int[] height) {
        
        int n=height.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return (memo(n-1,height,dp));//n-1 becuase it is zero based so passing length consider as out of bound
    }
}