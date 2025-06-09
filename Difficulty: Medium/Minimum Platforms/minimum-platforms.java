// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0;
        int j=0;
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        
        while(i<arr.length && j<dep.length){
            if(arr[i] <= dep[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}
