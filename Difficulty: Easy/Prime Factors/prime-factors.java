class Solution {
    public static boolean checkprime(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
            
        }
        return true;
    }
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0 && checkprime(i))
            ans.add(i);
        }
         for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n%i==0 && n/i != i && checkprime(n/i))
            ans.add(n/i);
        }
        
        return ans;
    }
}