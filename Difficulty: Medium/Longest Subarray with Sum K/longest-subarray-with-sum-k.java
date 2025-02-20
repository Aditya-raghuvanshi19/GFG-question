//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // int left=0;
        // int right=0;
        // int sum=arr[0],maxlen=0;
        // int n=arr.length;
        // while(right<n){
        //     while(sum>k && left<=right){
        //         sum -= arr[left];
        //         left++;
        //     }
        //     if(sum==k){
        //         maxlen=Math.max(maxlen,right-left+1);
        //     }
        //     right++;
        //     if(right<n)
        //     sum+=arr[right];
        // }
        // return maxlen;
        Map<Integer, Integer>presum = new HashMap<>();
        int n = arr.length;
        int maxlen = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                maxlen = Math.max(maxlen, i+1);
            }
        
            int rem = sum -k;
            if(presum.containsKey(rem)){
               int len = i-presum.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum,i);
            }
        }
        return maxlen;
    }
}
