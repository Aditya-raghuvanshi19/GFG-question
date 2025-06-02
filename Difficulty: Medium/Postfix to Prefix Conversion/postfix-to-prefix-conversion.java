// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> st=new Stack<>();
        int i=0;
        while(i<post_exp.length()){
            char c=post_exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            st.push(c+"");
            else{
                String t1=st.pop();
                String t2=st.pop();
                String rev= c+t2+t1;
                st.push(rev);
            }
            i++;
        }
        return st.peek();
    }
}
