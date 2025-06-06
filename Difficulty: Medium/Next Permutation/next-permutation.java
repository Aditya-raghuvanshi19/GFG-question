//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int [] arr ,int i){
        int end=arr.length-1;
        int start=i;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] arr) {
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
        i--;

        if(i>=0){
            int j=arr.length-1;
            while(j>=0 && arr[j]<=arr[i])
            j--;

            swap(arr,i,j);
        }

        reverse(arr,i+1);
    }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends