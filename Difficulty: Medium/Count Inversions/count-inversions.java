//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int merge(int arr[],int left,int mid,int right){
       List<Integer>list=new ArrayList<>();
        int l=left;
        int r=mid+1;
        int count=0;
        while(l<=mid&&r<=right){
            if(arr[l]<=arr[r]){
                list.add(arr[l]);
                l++;
                
            }else{
                list.add(arr[r]);
                r++;
                count+=(mid-l+1);
            }
        }
        while(l<=mid){
            list.add(arr[l]);
            l++;
        }
        while(r<=right){
            list.add(arr[r]);
            r++;
        }
        
        for(int i=0;i<list.size();i++){
            arr[i+left]=list.get(i);
        }
        return count;
        
    }
   static int mergesort(int arr[],int i,int j){
       int sum=0;
       if(i<j){
          int left=i;
       int right=j;
       int mid=(left+right)/2;
       
       int l=mergesort(arr,left,mid);
       int r=mergesort(arr,mid+1,right);
       
       int f=merge(arr,left,mid,right);

       sum=l+r+f;
       }
       return sum;
       
   }
    static int inversionCount(int arr[]) {
        return mergesort(arr,0,arr.length-1);
    }
}