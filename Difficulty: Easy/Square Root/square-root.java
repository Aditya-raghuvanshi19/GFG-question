class Solution {
    int floorSqrt(int n) {
        int s=0;
        int e=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n)return mid;
            
            else if(mid*mid < n ) s=mid+1;
            else e=mid-1;
            
        }
        return e;
        
    }
}