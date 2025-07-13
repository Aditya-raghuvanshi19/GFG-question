class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int ans=0;
        int s=0;
        int e=arr.size()-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            
            if(arr.get(s)<=arr.get(e)){
                if(arr.get(s)<=arr.get(ans))
                ans=s;
                break;
            }
            if(arr.get(s)<=arr.get(mid)){
                if(arr.get(s)<=arr.get(ans))
                ans=s;
                
                s=mid+1;
            }else{
                if(arr.get(mid)<=arr.get(ans))
                ans=mid;
                
                e=mid-1;
            }
        }
        return ans;
    }
}