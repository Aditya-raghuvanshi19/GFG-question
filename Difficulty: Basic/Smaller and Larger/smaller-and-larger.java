//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            int x = Integer.parseInt(sc.nextLine()); // consume the newline
            int[] ans = new Solution().getMoreAndLess(arr, x);
            System.out.println(ans[0] + " " + ans[1]);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    int lowerbound(int[]arr,int target){
        int l=0;
        int e=arr.length-1;
        while(l<=e){
            int mid=l+(e-l)/2;
            if(arr[mid]<=target)
            {
                
                l=mid+1;
            }
            
            else{
                
                e=mid-1;
            }
        }
        return l;
    }
    int upperbound(int[]arr,int target){
        int l=0;
        int e=arr.length-1;
        while(l<=e){
            int mid=l+(e-l)/2;
            if(arr[mid]<target)
            {
                
                l=mid+1;
            }
            
            else{
                
                e=mid-1;
            }
        }
        return l;
    }
    int[] getMoreAndLess(int[] arr, int target) {
        int [] arr1=new int[2];
        
        int n=arr.length;
        
        arr1[0]=lowerbound(arr,target);
        arr1[1]=n-upperbound(arr,target);
        return arr1;
    }
}