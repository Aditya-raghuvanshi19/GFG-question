//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static long fact(long n){
        if(n==1)
        return 1;
        return n*fact(n-1);
    }
    
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> l=new ArrayList<>();
      
        
    
        for(int i=1;i<=n;i++){
        if(fact(i)<=n)
        l.add(fact(i));
        else
        break;
    }
        
        
        return l;
        
    }
}