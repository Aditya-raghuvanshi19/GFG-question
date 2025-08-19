class Solution {
    public int longestKSubstr(String s, int k) {
        
        int[] hash=new int[26];
        int distinct=0;
        int l=0;
        int r=0;
        int maxlen=-1;
       
        while(r<s.length()){
            char c=s.charAt(r);
            if(hash[c-'a']==0)distinct++;
            hash[c-'a']++;
            
            while(distinct > k){
                char atL=s.charAt(l);
                hash[atL-'a']--;
                if(hash[atL-'a']==0)distinct--;
                
                l++;
            }
            
            if(distinct==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}