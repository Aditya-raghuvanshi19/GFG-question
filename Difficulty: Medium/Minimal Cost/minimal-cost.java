// User function Template for Java

class Solution {
    public int findmin(int n,int[] arr,int[]dp,int k){
        if(n==0)return 0;
        if(dp[n]!=-1)return dp[n];
        
        int mincost=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int cost=findmin(n-i,arr,dp,k) + Math.abs(arr[n]-arr[n-i]);
                mincost=Math.min(mincost,cost);
            }
            
        }
        dp[n]=mincost;
        return dp[n];
        
    }
    public int minimizeCost(int k, int arr[]) {
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return findmin(n-1,arr,dp,k);
        
    }
}
