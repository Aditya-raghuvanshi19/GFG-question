class Solution {
    static int minJumps(int[] arr) {
     int count=0;
        int l=0,r=0;
        
        while(r<arr.length-1){
            
            int farthest=0;
            
            for(int f=l;f<=r;f++){//this is check because in the particular range of l and r what is the max jump we can take and at that jump r be placed and l just after the r so that the new range is generared.
                farthest=Math.max(farthest,f+arr[f]);
            }
            
            if(farthest<=r)return -1;
            
            l=r+1;
            r=farthest;
            count++;
        }
        return count;
        
    }
}