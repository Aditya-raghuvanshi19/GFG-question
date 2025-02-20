//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int f(int n){
        if(n==1)
        return 1;
        int sum=1+n;
        for(int i=2;i<n;i++){
            if(n%i==0)
            sum+=i;
        }
        return sum;
    }
    public static int sumOfDivisors(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += f(i);
        }
        return sum;
    }
}