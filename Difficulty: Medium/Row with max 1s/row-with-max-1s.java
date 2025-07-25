// User function Template for Java

class Solution {
    public int lowerbound(int arr[] , int k){
        int s=0;
        int e=arr.length-1;
        
        int lower=arr.length;//this is the hypothetical index that if k is not in the arrau it maneas it ias as at the last index of array
        while(s<=e){
            int mid=(s+e)/2;
            
            if(arr[mid] >= k){
                lower=mid;
                e=mid-1;//because we need smaller index (lower bound)
            }
            else
            s=mid+1;
            
        }
        return lower;
        
    }
    public int rowWithMax1s(int arr[][]) {
        int n=arr.length;
        int m=arr[0].length;
        
        int max_count=0;
        int index=-1;
        
        for(int i=0;i<n;i++){
            int index_one= lowerbound(arr[i],1);
            int count_one = m-index_one;
            
            if(count_one > max_count){
                max_count=count_one;
                index=i;
            }
        }
        return index;
        
    }
}