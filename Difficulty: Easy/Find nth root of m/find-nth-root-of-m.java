// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
       
       int s=0;
       int e=m;
       while(s<=e){
           int mid=s+(e-s)/2;
           
           if(Math.pow(mid,n)==m)return mid;
           else if(Math.pow(mid,n)< m) s=mid+1;
           else
           e=mid-1;
       }
       return -1;
        
    }
}