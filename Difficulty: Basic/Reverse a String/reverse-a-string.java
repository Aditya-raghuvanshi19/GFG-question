//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Solution().reverseString(str));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        //always use this approach no other way
        //beast is convert in char array and now this is same apply for array reverse
        //so you can use these way for both arrray and string
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            char st=arr[i];
            arr[i]=arr[j];
           arr[j]=st;
            i++;
            j--;
        }
        return new String(arr);//no use array.toString(arr)because that return soime hash cvalue of aadaress of arrray 
        //better to use newString() create a new String of arr
    }
}