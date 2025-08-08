class Solution {
    public static boolean isprime(int n){
        if(n<=1)return false;
        
        for(int i=2;i <= Math.sqrt(n); i++){
            if(n%i==0)return false;
            
            
        }
        return true;
    }
    public static void print_divisors(int n) {
        
        
        if(isprime(n))System.out.print(1 + " "+n);
        
        else{
            
        
        for(int i=1;i <= Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i + " ");
            
           
            }
        }
        
        for(int i= (int)Math.sqrt(n); i>=1;i--){
            if(n% i==0 && n/i != i)System.out.print(n/i+ " ");
        }
        }
    }
}
