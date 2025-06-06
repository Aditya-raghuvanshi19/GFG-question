//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            // Ensure input is read correctly
            inputLine = br.readLine().trim().split(" ");
            if (inputLine == null || inputLine.length == 0) {
                System.out.println("Invalid input");
                continue;
            }

            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
       int n=arr.length;
       int ans=arr[n-1]-arr[0];
       int min=arr[0]+k;
       int max=arr[n-1]-k;
       
       int mi,mx;
       
       for(int i=0;i<n-1;i++){
           mi=Math.min(min,arr[i+1]-k);
           mx=Math.max(max,arr[i]+k);
           
           if(mi<0)continue;
           
           ans=Math.min(ans,mx-mi);
           
       }
       return ans;
    }
}
