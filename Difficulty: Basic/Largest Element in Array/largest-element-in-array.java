class Solution {
    public static int largest(int[] arr) {
       int maxel=Integer.MIN_VALUE;
       
        for(int i:arr){
            maxel=Math.max(i,maxel);
        }
        return maxel;
    }
}
