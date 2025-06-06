//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(a, b);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// a,b : the arrays
class Solution {
     static void addToResult(ArrayList<Integer> result, int value) {
        if (result.isEmpty() || result.get(result.size() - 1) != value) {
            result.add(value);
        }
    }
    
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       
       ArrayList<Integer> result=new ArrayList<>();
       int n1=a.length;
       int n2=b.length;
       int i=0;
       int j=0;
       
           while(i<n1 && j<n2){
           if (a[i] < b[j]) {
                addToResult(result, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                addToResult(result, b[j]);
                j++;
            } else { //for equal element
                addToResult(result, a[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            addToResult(result, a[i]);
            i++;
        }

        while (j < n2) {
            addToResult(result, b[j]);
            j++;
        }

        return result;
    }

    
}