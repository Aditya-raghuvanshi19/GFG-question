class Solution {
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a , a);
    }
    public static int[] lcmAndGcd(int a, int b) {
       
        int[] ans=new int[2];
        int hcf=gcd(a,b);
        ans[1]=hcf;
        ans[0]=(a*b)/hcf;
        return ans;
    }
}