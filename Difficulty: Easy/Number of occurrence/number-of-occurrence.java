class Solution {
    int firstocc(int[]arr,int x){
      int s=0;
      int e=arr.length-1;
      int ans=-1;
      while(s<=e){
          int mid=(s+e)/2;
          if(arr[mid]==x){
              ans=mid;
              e=mid-1;
          }else if(arr[mid]<x)
          s=mid+1;
          else
          e=mid-1;
      }
      return ans;
    }
    int lastocc(int[]arr,int x){
      int s=0;
      int e=arr.length-1;
      int ans=-1;
      while(s<=e){
          int mid=(s+e)/2;
          if(arr[mid]==x){
              ans=mid;
              s=mid+1;
          }else if(arr[mid]<x)
          s=mid+1;
          else
          e=mid-1;
      }
      return ans;
    }
    int countFreq(int[] arr, int target) {
        if(firstocc(arr,target)==-1)return 0;
      return lastocc(arr,target)-firstocc(arr,target)+1;
        
    }
}
