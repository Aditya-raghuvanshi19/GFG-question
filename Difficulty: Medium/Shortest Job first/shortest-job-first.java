// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        
        Arrays.sort(bt);
        
       int waitingtime=0;
       int n=bt.length;
       int time=0;
       
       for(int i=0;i<n;i++){
           waitingtime += time;
           
           time=time+ bt[i];
       }
       
       return waitingtime/n;
        
    }
}
