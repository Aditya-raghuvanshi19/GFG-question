// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int [] ans=new int[2];
        Arrays.fill(ans,-1);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x)ans[0]=Math.max(ans[0],arr[i]);
            if(arr[i]>=x){
                if(ans[1]==-1)ans[1]=arr[i];
                else
                ans[1]=Math.min(ans[1],arr[i]);
            }
        }
        return ans;
        
    }
}
