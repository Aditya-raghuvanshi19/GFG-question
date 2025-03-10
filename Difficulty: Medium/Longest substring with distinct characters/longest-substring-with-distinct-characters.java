//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
         HashMap<Character,Integer>mp=new HashMap<>();
        int len=0;
        int left=0;
        int right=0;
        int n=s.length();
        while(right<n){
            if(mp.containsKey(s.charAt(right)))
            left=Math.max(mp.get(s.charAt(right))+1,left);

            len=Math.max(right-left+1,len);
            mp.put(s.charAt(right),right);
            right++;
        }
        return len;
    }
}