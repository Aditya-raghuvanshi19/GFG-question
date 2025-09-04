// User function Template for Java

class Solution {
    public int f(int n,int arr[][] ,int last, int dp[][]){
        if(n==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last)
                maxi=Math.max(maxi,arr[0][i]);
            }
            return maxi;
        }
        
        if(dp[n][last] != -1)return dp[n][last];
        int maxi=0;
        int points=0;
        for(int i=0;i<3;i++){
            if(i!=last)
            points=arr[n][i] + f(n-1 , arr ,i,dp);
            maxi=Math.max(points,maxi);
            
        }
        dp[n][last]=maxi;
        return dp[n][last];
        
    }
    public int maximumPoints(int arr[][]) {
       
       int n=arr.length;
       int[][] dp=new int[n][4];
       for(int i=0;i<n;i++){
           for(int j=0;j<4;j++){
               dp[i][j]=-1;
           }
       }
       
       return f(n-1,arr,3,dp);
        
    }
}