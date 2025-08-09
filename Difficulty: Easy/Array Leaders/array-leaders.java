class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
       ArrayList<Integer> ans=new ArrayList<>();
       int rl=arr[arr.length-1];
       ans.add(rl);
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>=rl){
               ans.add(arr[i]);
               rl=arr[i];
           }
       }
       Collections.sort(ans , (a,b)->b-a);
       return ans;
        
    }
}
