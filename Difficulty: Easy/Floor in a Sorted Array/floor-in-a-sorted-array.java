class Solution {

    static int findFloor(int[] arr, int x) {
        int ans=-1 , n =arr.length;
        int s=0;
        int e=n-1;
        
        while(s<=e){
            int mid= (s+e)/2;
            
            if(arr[mid] <= x){
                ans=Math.max(ans,mid);
                s=mid+1;
                
            }else
            e=mid-1;
        }
        return ans;
    }
}
