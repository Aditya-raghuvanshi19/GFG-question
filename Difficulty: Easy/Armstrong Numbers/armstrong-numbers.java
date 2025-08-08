// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int size=(int) Math.log10(n)+1;
        int temp=n;
        int opt=0;
        while(n!=0){
            int rem=n%10;
            opt += Math.pow(rem,size);
            n/=10;
        }
        if(opt==temp)return true;
        return false;
        
    }
}